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

import com.tekup.livraiso.Services.LivraisonService;
import com.tekup.livraiso.dto.LivraisonDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Livraison")
@RequiredArgsConstructor
public class LivraisonController {
	@Autowired
    private  LivraisonService livraisonService;
   @GetMapping
    public ResponseEntity<Page<LivraisonDTO>> getAllLivraisons(Pageable pageable) {
        Page<LivraisonDTO> livraisons = livraisonService.getAllLivraisons(pageable);
        return ResponseEntity.ok(livraisons);
    }
    @PostMapping
    public LivraisonDTO addOneLivraison(@RequestBody LivraisonDTO livraison)
    {
	return livraisonService.addOneLivraison(livraison);	
    }
    @DeleteMapping("/{id}")
    public void deleteOneLivraison(@PathVariable long id)
    {
    	livraisonService.deleteOneLivraison(id);	
    }
}
