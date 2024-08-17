package com.tekup.livraiso.ServicesImpl;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.AdresseRepository;
import com.tekup.livraiso.Repository.DemandeRepository;
import com.tekup.livraiso.Repository.LivraisonRepository;
import com.tekup.livraiso.Repository.PickupRepository;
import com.tekup.livraiso.Repository.ProfilRepository;
import com.tekup.livraiso.Repository.ReclamationRepository;
import com.tekup.livraiso.Repository.UtilisateurRepository;
import com.tekup.livraiso.Services.UtilisateurService;
import com.tekup.livraiso.dto.AdresseDTO;
import com.tekup.livraiso.dto.DemandeDTO;
import com.tekup.livraiso.dto.EvaluationDTO;
import com.tekup.livraiso.dto.LivraisonDTO;
import com.tekup.livraiso.dto.PickupDTO;
import com.tekup.livraiso.dto.ProfilDTO;
import com.tekup.livraiso.dto.ReclamationDTO;
import com.tekup.livraiso.dto.UtilisateurDTO;
import com.tekup.livraiso.mappers.AdresseMapper;
import com.tekup.livraiso.mappers.DemandeMapper;
import com.tekup.livraiso.mappers.LivraisonMapper;
import com.tekup.livraiso.mappers.PickupMapper;
import com.tekup.livraiso.mappers.ProfilMapper;
import com.tekup.livraiso.mappers.ReclamationMapper;
import com.tekup.livraiso.mappers.UtilisateurMapper;
import com.tekup.livraiso.model.Adresse;
import com.tekup.livraiso.model.Demande;
import com.tekup.livraiso.model.Livraison;
import com.tekup.livraiso.model.Pickup;
import com.tekup.livraiso.model.Profil;
import com.tekup.livraiso.model.Reclamation;
import com.tekup.livraiso.model.Utilisateur;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Autowired
	private ReclamationRepository reclamationRepository;
	@Autowired
	private ProfilRepository profilRepository;
	@Autowired
	private PickupRepository pickupRepository;
	@Autowired
	private LivraisonRepository livraisonRepository;
	@Autowired
	private DemandeRepository demandeRepository;
	@Autowired
	private AdresseRepository adresseRepository;

	@Override
	public UtilisateurDTO addOneUtilisateur(UtilisateurDTO utilisateur) {
		return UtilisateurMapper.convertToDto(utilisateurRepository.save(UtilisateurMapper.convertToEntity(utilisateur)));
	}

	@Override
	public void deleteOneUtilisateur(long id) {
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public Optional<UtilisateurDTO> findOneUtilisateur(long id) {
		return utilisateurRepository.findById(id).map(UtilisateurMapper::convertToDto);
	}

	@Override
	public UtilisateurDTO assignReclamationToUtilisateur(long id, ReclamationDTO reclamation) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Reclamation rec=ReclamationMapper.convertToEntity(reclamation);
			rec.setUtilisateur(utilisateur);
			reclamationRepository.save(rec);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;}

	@Override
	public UtilisateurDTO assignProfilToUtilisateur(long id, ProfilDTO profil) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Profil pro=ProfilMapper.convertToEntity(profil);
			pro.setUtilisateur(utilisateur);
			profilRepository.save(pro);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public UtilisateurDTO assignPickupToUtilisateur(long id, PickupDTO pickup) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Pickup pic=PickupMapper.convertToEntity(pickup);
			pic.setUtilisateur(utilisateur);
			pickupRepository.save(pic);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public UtilisateurDTO assignLivraisonToUtilisateur(long id, LivraisonDTO livraison) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Livraison liv=LivraisonMapper.convertToEntity(livraison);
			liv.setUtilisateur(utilisateur);
			livraisonRepository.save(liv);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}


	@Override
	public UtilisateurDTO assignDemandeToUtilisateur(long id, DemandeDTO demande) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Demande dem=DemandeMapper.convertToEntity(demande);
			dem.setUtilisateur(utilisateur);
			demandeRepository.save(dem);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public UtilisateurDTO assignAdresseToUtilisateur(long id, AdresseDTO adresse) {
		Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
		if (utilisateur!=null) {
			Adresse adr=AdresseMapper.convertToEntity(adresse);
			adr.setUtilisateur(utilisateur);
			adresseRepository.save(adr);
			return UtilisateurMapper.convertToDto(utilisateur);
			}
		return null;
	}

	@Override
	public Page<UtilisateurDTO> getAllUtilisateurs(Pageable pageable) {
			Page<Utilisateur> users=utilisateurRepository.findAll(pageable);
			return users.map(UtilisateurMapper::convertToDto);
	}
	@Override
	public UtilisateurDTO assignEvaluationToUtilisateur(long id, EvaluationDTO evaluation) {
		// TODO Auto-generated method stub
		return null;
	}








	

	


}
