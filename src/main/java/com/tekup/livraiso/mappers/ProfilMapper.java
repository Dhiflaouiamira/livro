package com.tekup.livraiso.mappers;


import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.ProfilDTO;
import com.tekup.livraiso.model.Profil;

public class ProfilMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static ProfilDTO convertToDto(Profil profil)
	{
		return modelMapper.map(profil, ProfilDTO.class);
	}
	public static Profil convertToEntity(ProfilDTO profilDTO)
	{
		return modelMapper.map(profilDTO, Profil.class);
	}
}

