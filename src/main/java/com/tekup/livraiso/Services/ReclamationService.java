package com.tekup.livraiso.Services;


import org.springframework.data.domain.Page;

import com.tekup.livraiso.dto.ReclamationDTO;




public interface ReclamationService {
	public Page<ReclamationDTO> getAllReclamation(org.springframework.data.domain.Pageable pageable);
	public ReclamationDTO  addOneReclamation(ReclamationDTO reclamation);
	public void deleteOneReclamation(long id);


}
