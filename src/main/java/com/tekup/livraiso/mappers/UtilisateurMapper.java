package com.tekup.livraiso.mappers;
import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.UtilisateurDTO;
import com.tekup.livraiso.model.Utilisateur;





public class UtilisateurMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static UtilisateurDTO convertToDto(Utilisateur utilisateur)
	{
		return modelMapper.map(utilisateur, UtilisateurDTO.class);
	}
	public static Utilisateur convertToEntity(UtilisateurDTO utilisateurDTO)
	{
		return modelMapper.map(utilisateurDTO, Utilisateur.class);
	}
}
