package com.tekup.livraiso.Services;


import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tekup.livraiso.dto.LivraisonDTO;



public interface LivraisonService {

	public Page<LivraisonDTO> getAllLivraisons(Pageable pageable) ;
	public LivraisonDTO addOneLivraison(LivraisonDTO livraison);
	public void deleteOneLivraison(long id);
	public Optional<LivraisonDTO> findOneLivraison(long id);
}
