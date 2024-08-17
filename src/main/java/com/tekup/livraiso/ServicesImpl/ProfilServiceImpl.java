package com.tekup.livraiso.ServicesImpl;


import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.ProfilRepository;
import com.tekup.livraiso.Services.ProfilService;
import com.tekup.livraiso.dto.ProfilDTO;
import com.tekup.livraiso.mappers.ProfilMapper;
import com.tekup.livraiso.model.Profil;


@Service
public class ProfilServiceImpl implements ProfilService {

private ProfilRepository profilRepository;

	

	@Override
	public ProfilDTO addOneProfil(ProfilDTO profil) {
		return ProfilMapper.convertToDto(profilRepository.save(ProfilMapper.convertToEntity(profil)));

	}

	@Override
	public void deleteOneProfil(long id) {
		profilRepository.deleteById(id);
	
	}

	@Override
	public Page<ProfilDTO> getAllProfil(Pageable pageable) {
		Page<Profil> profils=profilRepository.findAll(pageable);
		return profils.map(ProfilMapper::convertToDto);

	}

	

}
