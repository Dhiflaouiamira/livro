package com.tekup.livraiso.mappers;


import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.ReclamationDTO;
import com.tekup.livraiso.model.Reclamation;

public class ReclamationMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static ReclamationDTO convertToDto(Reclamation reclamation)
	{
		return modelMapper.map(reclamation, ReclamationDTO.class);
	}
	public static Reclamation convertToEntity(ReclamationDTO reclamationDTO)
	{
		return modelMapper.map(reclamationDTO, Reclamation.class);
	}
}
