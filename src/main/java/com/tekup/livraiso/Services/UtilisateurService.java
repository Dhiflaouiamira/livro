package com.tekup.livraiso.Services;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tekup.livraiso.dto.AdresseDTO;
import com.tekup.livraiso.dto.DemandeDTO;
import com.tekup.livraiso.dto.EvaluationDTO;
import com.tekup.livraiso.dto.LivraisonDTO;
import com.tekup.livraiso.dto.PickupDTO;
import com.tekup.livraiso.dto.ProfilDTO;
import com.tekup.livraiso.dto.ReclamationDTO;
import com.tekup.livraiso.dto.UtilisateurDTO;



public interface UtilisateurService {	

	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable) ;
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur);
	public void deleteOneUtilisateur(long id);
	public Optional<UtilisateurDTO> findOneUtilisateur(long id);
	public UtilisateurDTO assignReclamationToUtilisateur(long id ,ReclamationDTO reclamation);
	public  UtilisateurDTO  assignProfilToUtilisateur(long id ,ProfilDTO profil);
	public UtilisateurDTO assignPickupToUtilisateur(long id ,PickupDTO pickup);
	public UtilisateurDTO assignLivraisonToUtilisateur(long id ,LivraisonDTO livraison);
	public UtilisateurDTO assignEvaluationToUtilisateur(long id ,EvaluationDTO evaluation);
	public UtilisateurDTO assignDemandeToUtilisateur(long id ,DemandeDTO demande);
	public UtilisateurDTO assignAdresseToUtilisateur(long id ,AdresseDTO adresse);
	
}
