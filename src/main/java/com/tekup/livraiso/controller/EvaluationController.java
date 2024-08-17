package com.tekup.livraiso.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.livraiso.Services.EvaluationService;
import com.tekup.livraiso.dto.EvaluationDTO;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("Evaluation")
@RequiredArgsConstructor
public class EvaluationController {
	@Autowired
    private  EvaluationService evaluationService;
   @GetMapping
    public Page<EvaluationDTO> getAllEvaluations(Pageable pageable) {
        return evaluationService.getAllEvaluation(pageable);
    }
    @PostMapping
    public EvaluationDTO addOneEvaluation(@RequestBody EvaluationDTO evaluation)
    {
	return evaluationService.addOneEvaluation(evaluation);	
    }
    @DeleteMapping("/{id}")
    public void deleteOneEvaluation(@PathVariable long id)
    {
    	evaluationService.deleteOneEvaluation(id);	
    }
}
