package com.tekup.livraiso.mappers;


import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.DemandeDTO;
import com.tekup.livraiso.model.Demande;

public class DemandeMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static DemandeDTO convertToDto(Demande demande)
	{
		return modelMapper.map(demande, DemandeDTO.class);
	}
	public static Demande convertToEntity(DemandeDTO demandeDTO)
	{
		return modelMapper.map(demandeDTO, Demande.class);
	}
}