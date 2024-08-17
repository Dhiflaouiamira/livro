package com.tekup.livraiso.model;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Utilisateur {
	@Id
	private Long id;
	@Column(nullable=false)
	private String nom ;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false)
	private String age ; 
	@Column(nullable=false)
	private String email ;
	@Column(nullable=false)
	private String mdp ;
	@Enumerated(EnumType.STRING)
	private Grade grade;
	@OneToMany(mappedBy = "utilisateur")
	List<Livraison> livraisons;
	@OneToOne(mappedBy = "utilisateur",cascade = CascadeType.ALL)
	Profil profil;
	@OneToMany(mappedBy = "utilisateur")
    private List<Reclamation> reclamations;
	@OneToMany(mappedBy = "utilisateur")
    private List<Pickup> pickups;
	@OneToMany(mappedBy = "utilisateur")
    private List<Evaluation> evalutions;
	@OneToMany(mappedBy = "utilisateur")
    private List<Demande> demandes;
	@OneToMany(mappedBy = "utilisateur")
    private List<Adresse> adresses;
	
	
	
	
}
