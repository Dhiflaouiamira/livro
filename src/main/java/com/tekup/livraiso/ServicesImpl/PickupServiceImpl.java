package com.tekup.livraiso.ServicesImpl;


import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.PickupRepository;
import com.tekup.livraiso.Services.PickupService;
import com.tekup.livraiso.dto.PickupDTO;
import com.tekup.livraiso.mappers.PickupMapper;
import com.tekup.livraiso.model.Pickup;


@Service
public class PickupServiceImpl implements PickupService {

private PickupRepository pickupRepository;

	

	@Override
	public PickupDTO addOnePickup(PickupDTO pickup) {
		return PickupMapper.convertToDto(pickupRepository.save(PickupMapper.convertToEntity(pickup)));

	}

	@Override
	public void deleteOnePickup(long id) {
		pickupRepository.deleteById(id);
	
	}

	@Override
	public Page<PickupDTO> getAllPickup(Pageable pageable) {
		Page<Pickup> users=pickupRepository.findAll(pageable);
		return users.map(PickupMapper::convertToDto);
	}

	

	}

	

