package com.tekup.livraiso.ServicesImpl;


import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.LivraisonRepository;
import com.tekup.livraiso.Services.LivraisonService;
import com.tekup.livraiso.dto.LivraisonDTO;
import com.tekup.livraiso.mappers.LivraisonMapper;


@Service
public class LivraisonServiceImpl implements LivraisonService {

private LivraisonRepository livraisonRepository;

	

	@Override
	public LivraisonDTO addOneLivraison(LivraisonDTO evalution) {
		return LivraisonMapper.convertToDto(livraisonRepository.save(LivraisonMapper.convertToEntity(evalution)));

	}

	@Override
	public void deleteOneLivraison(long id) {
		livraisonRepository.deleteById(id);
	
	}



	@Override
	public Page<LivraisonDTO> getAllLivraisons(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<LivraisonDTO> findOneLivraison(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	


}
