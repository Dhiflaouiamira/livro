package com.tekup.livraiso.ServicesImpl;


import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.ReclamationRepository;
import com.tekup.livraiso.Services.ReclamationService;
import com.tekup.livraiso.dto.ReclamationDTO;
import com.tekup.livraiso.mappers.ReclamationMapper;
import com.tekup.livraiso.model.Reclamation;

import org.springframework.data.domain.Page;


@Service
public class ReclamationServiceImpl implements ReclamationService {
	private ReclamationRepository reclamationRepository;

	@Override
	public ReclamationDTO addOneReclamation(ReclamationDTO reclamation) {
		return ReclamationMapper
				.convertToDto(reclamationRepository.save(ReclamationMapper.convertToEntity(reclamation)));

	}

	@Override
	public void deleteOneReclamation(long id) {
		reclamationRepository.deleteById(id);

	}

	@Override
	public Page<ReclamationDTO> getAllReclamation(Pageable pageable) {
		Page<Reclamation> reclamations = reclamationRepository.findAll(pageable);
		return reclamations.map(ReclamationMapper::convertToDto);

	}


	
}
