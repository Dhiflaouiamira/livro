package com.tekup.livraiso.ServicesImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.DemandeRepository;
import com.tekup.livraiso.Services.DemandeService;
import com.tekup.livraiso.dto.DemandeDTO;
import com.tekup.livraiso.mappers.DemandeMapper;
import com.tekup.livraiso.model.Demande;


@Service
public class DemandeServiceImpl implements DemandeService {

private DemandeRepository demandeRepository;

	

	@Override
	public DemandeDTO addOneDemande(DemandeDTO demande) {
		return DemandeMapper.convertToDto(demandeRepository.save(DemandeMapper.convertToEntity(demande)));

	}

	@Override
	public void deleteOneDemande(long id) {
		demandeRepository.deleteById(id);
	
	}

	@Override
	public Page<DemandeDTO> getAllDemande(Pageable pageable) {
		Page<Demande> demandes=demandeRepository.findAll(pageable);
		return demandes.map(DemandeMapper::convertToDto);

	}





	
}
