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

import com.tekup.livraiso.Services.ProfilService;
import com.tekup.livraiso.dto.ProfilDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Profil")
@RequiredArgsConstructor
public class ProfilController {
	@Autowired
    private  ProfilService profilService;
   @GetMapping
    public ResponseEntity<Page<ProfilDTO>> getAllProfils(Pageable pageable) {
        Page<ProfilDTO> profils = profilService.getAllProfil(pageable);
        return ResponseEntity.ok(profils);
    }
    @PostMapping
    public ProfilDTO addOneProfil(@RequestBody ProfilDTO profil)
    {
	return profilService.addOneProfil(profil);	
    }
    @DeleteMapping("/{id}")
    public void deleteOneProfil(@PathVariable long id)
    {
    	profilService.deleteOneProfil(id);	
    }
}
