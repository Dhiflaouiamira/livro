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

import com.tekup.livraiso.Services.DemandeService;
import com.tekup.livraiso.dto.DemandeDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Demande")
@RequiredArgsConstructor
public class DemandeController {
	@Autowired
    private  DemandeService demandeService;
   @GetMapping
    public ResponseEntity<Page<DemandeDTO>> getAllDemandes(Pageable pageable) {
        Page<DemandeDTO> demandes = demandeService.getAllDemande(pageable);
        return ResponseEntity.ok(demandes);
    }
    @PostMapping
    public DemandeDTO addOneDemande(@RequestBody DemandeDTO demande)
    {
	return demandeService.addOneDemande(demande);	
    }
    @DeleteMapping("/{id}")
    public void deleteOneDemande(@PathVariable long id)
    {
    	demandeService.deleteOneDemande(id);	
    }
}
