package com.tekup.livraiso.mappers;


import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.PickupDTO;
import com.tekup.livraiso.model.Pickup;

public class PickupMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static PickupDTO convertToDto(Pickup pickup)
	{
		return modelMapper.map(pickup, PickupDTO.class);
	}
	public static Pickup convertToEntity(PickupDTO pickupDTO)
	{
		return modelMapper.map(pickupDTO, Pickup.class);
	}
}