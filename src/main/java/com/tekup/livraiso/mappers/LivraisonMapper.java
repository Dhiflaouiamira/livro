package com.tekup.livraiso.mappers;


import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.LivraisonDTO;
import com.tekup.livraiso.model.Livraison;

public class LivraisonMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static LivraisonDTO convertToDto(Livraison livraison)
	{
		return modelMapper.map(livraison, LivraisonDTO.class);
	}
	public static Livraison convertToEntity(LivraisonDTO livraisonDTO)
	{
		return modelMapper.map(livraisonDTO, Livraison.class);
	}
}