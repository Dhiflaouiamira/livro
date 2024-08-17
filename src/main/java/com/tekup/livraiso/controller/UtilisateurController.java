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

import com.tekup.livraiso.Services.UtilisateurService;
import com.tekup.livraiso.dto.AdresseDTO;
import com.tekup.livraiso.dto.DemandeDTO;
import com.tekup.livraiso.dto.LivraisonDTO;
import com.tekup.livraiso.dto.PickupDTO;
import com.tekup.livraiso.dto.ProfilDTO;
import com.tekup.livraiso.dto.ReclamationDTO;
import com.tekup.livraiso.dto.UtilisateurDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/utilisateur")
@RequiredArgsConstructor
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;
    @GetMapping
    public ResponseEntity<Page<UtilisateurDTO>> getAllUtilisateurs(Pageable pageable) {
        Page<UtilisateurDTO> utilisateurs = utilisateurService.getAllUtilisateurs(pageable);
        return ResponseEntity.ok(utilisateurs);
    }

    @PostMapping
    public UtilisateurDTO addOneUtilisateur(@RequestBody UtilisateurDTO utilisateur) {
        return utilisateurService.addOneUtilisateur(utilisateur);    
    }
    
    @DeleteMapping("/{id}")
    public void deleteOneUtilisateur(@PathVariable long id) {
        utilisateurService.deleteOneUtilisateur(id);    
    }
    
    @PostMapping("/reclamation/{id}")
    public UtilisateurDTO assignToReclamation(@PathVariable long id, @RequestBody ReclamationDTO reclamation) {
        return utilisateurService.assignReclamationToUtilisateur(id, reclamation);    
    }
    
    @PostMapping("/profil/{id}")
    public UtilisateurDTO assignToProfil(@PathVariable long id, @RequestBody ProfilDTO profil) {
        return utilisateurService.assignProfilToUtilisateur(id, profil);    
    }
    
    @PostMapping("/pickup/{id}")
    public UtilisateurDTO assignToPickup(@PathVariable long id, @RequestBody PickupDTO pickup) {
        return utilisateurService.assignPickupToUtilisateur(id, pickup);    
    }
    
    @PostMapping("/livraison/{id}")
    public UtilisateurDTO assignToLivraison(@PathVariable long id, @RequestBody LivraisonDTO livraison) {
        return utilisateurService.assignLivraisonToUtilisateur(id, livraison);    
    }
    
    @PostMapping("/demande/{id}")
    public UtilisateurDTO assignToDemande(@PathVariable long id, @RequestBody DemandeDTO demande) {
        return utilisateurService.assignDemandeToUtilisateur(id, demande);    
    }
    
    @PostMapping("/adresse/{id}")
    public UtilisateurDTO assignToAdresse(@PathVariable long id, @RequestBody AdresseDTO adresse) {
        return utilisateurService.assignAdresseToUtilisateur(id, adresse);    
    }
}
