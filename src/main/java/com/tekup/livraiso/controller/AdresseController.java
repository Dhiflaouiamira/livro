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

import com.tekup.livraiso.Services.AdressService;
import com.tekup.livraiso.dto.AdresseDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Adresse")
@RequiredArgsConstructor
public class AdresseController {
	@Autowired
    private  AdressService adresseService;
   @GetMapping
   public Page<AdresseDTO> getAllAdresses(Pageable pageable) {
       return adresseService.getAllAdresse(pageable);
    }
    @PostMapping
    public AdresseDTO addOneAdresse(@RequestBody AdresseDTO adresse)
    {
	return adresseService.addOneAdresse(adresse);	
    }
    @DeleteMapping("/{id}")
    public void deleteOneAdresse(@PathVariable long id)
    {
    	adresseService.deleteOneAdresse(id);	
    }
}
