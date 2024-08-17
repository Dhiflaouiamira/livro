package com.tekup.livraiso.Services;


import org.springframework.data.domain.Page;

import com.tekup.livraiso.dto.ProfilDTO;


public interface ProfilService {
	public Page<ProfilDTO> getAllProfil(org.springframework.data.domain.Pageable pageable) ;
	public ProfilDTO  addOneProfil(ProfilDTO profil);
	public void deleteOneProfil(long id);

}
