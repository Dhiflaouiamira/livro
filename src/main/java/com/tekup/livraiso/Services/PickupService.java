package com.tekup.livraiso.Services;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import com.tekup.livraiso.dto.PickupDTO;



public interface PickupService {

	
	
	
	Page<PickupDTO> getAllPickup(Pageable pageable);
	public void deleteOnePickup(long id);
	public PickupDTO addOnePickup(PickupDTO pickup);


}
