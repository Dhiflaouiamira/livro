package com.tekup.livraiso.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tekup.livraiso.model.Grade;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class UtilisateurDTO {
	@NotBlank
	private String nom ;
	@NotBlank
	private String prenom;
	@NotBlank
	private String age ; 
    @Email
	private String email ;
	@NotBlank
	private String mdp ;
	@NotBlank
	private Grade grade;
	@JsonIgnoreProperties("utilisateurs")
	private ReclamationDTO reclamation;
	@JsonIgnoreProperties("utilisateurs")
	private ProfilDTO profils;
	@JsonIgnoreProperties("utilisateurs")
	private PickupDTO pickups;
	@JsonIgnoreProperties("utilisateurs")
	private LivraisonDTO livrasions;
	@JsonIgnoreProperties("utilisateurs")
	private EvaluationDTO evaluations;
	@JsonIgnoreProperties("utilisateurs")
	private DemandeDTO demande;
	@JsonIgnoreProperties("utilisateurs")
	private AdresseDTO adresses;

}
