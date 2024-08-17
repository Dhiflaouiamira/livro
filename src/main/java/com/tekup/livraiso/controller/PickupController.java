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

import com.tekup.livraiso.Services.PickupService;
import com.tekup.livraiso.dto.PickupDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/pickup")
@RequiredArgsConstructor
public class PickupController {
	@Autowired
    private  PickupService pickupService;
   @GetMapping
    public ResponseEntity<Page<PickupDTO>> getAllPickups(Pageable pageable) {
        Page<PickupDTO> pickups = pickupService.getAllPickup(pageable);
        return ResponseEntity.ok(pickups);
    }
    @PostMapping
    public PickupDTO addOnePickup(@RequestBody PickupDTO pickup)
    {
	return pickupService.addOnePickup(pickup);
    }
    @DeleteMapping("/{id}")
    public void deleteOnePickup(@PathVariable long id)
    {
    	pickupService.deleteOnePickup(id);	
    }
}
