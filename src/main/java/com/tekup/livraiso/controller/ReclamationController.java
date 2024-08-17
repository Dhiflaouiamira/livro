package com.tekup.livraiso.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.livraiso.Services.ReclamationService;
import com.tekup.livraiso.dto.ReclamationDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/reclamation")
@RequiredArgsConstructor
public class ReclamationController {
	@Autowired
    private  ReclamationService reclamationService;
   @GetMapping
    public ResponseEntity<Page<ReclamationDTO>> getAllReclamations(Pageable pageable) {
        Page<ReclamationDTO> reclamations = reclamationService.getAllReclamation(pageable);
        return ResponseEntity.ok(reclamations);
    }
    @PostMapping
    public ReclamationDTO addOneReclamation(@RequestBody ReclamationDTO reclamation)
    {
	return reclamationService.addOneReclamation(reclamation);	
    }
    @DeleteMapping("/{id}")
    public void deleteOneReclamation(@PathVariable long id)
    {
    	reclamationService.deleteOneReclamation(id);	
    }
}
