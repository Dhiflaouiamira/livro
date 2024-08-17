package com.tekup.livraiso.mappers;

import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.AdresseDTO;
import com.tekup.livraiso.model.Adresse;

public class AdresseMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static AdresseDTO convertToDto(Adresse adresse)
	{
		return modelMapper.map(adresse, AdresseDTO.class);
	}
	public static Adresse convertToEntity(AdresseDTO adresseDTO)
	{
		return modelMapper.map(adresseDTO, Adresse.class);
	}
}