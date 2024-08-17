package com.tekup.livraiso.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
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

public class Livraison {
	@Id
	private Long id;
	@Column(nullable=false)
	private String nom;
	@Column(nullable=false)
	private String Referance;
	@Column(nullable=false)
	private String nom_client;
	@Column(nullable=false)
	private String adresse;
	@Column(nullable=false)
	private String dure;
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	private Utilisateur utilisateur;

}
