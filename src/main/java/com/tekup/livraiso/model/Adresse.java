package com.tekup.livraiso.model;

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

public class Adresse {
	@Id
	private Long id;
	private String ville;
	private String codepostal;
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	    private Utilisateur utilisateur;
	
}
