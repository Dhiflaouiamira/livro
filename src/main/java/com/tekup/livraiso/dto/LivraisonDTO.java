package com.tekup.livraiso.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
@Data

public class LivraisonDTO {
    @NotBlank
	private String nom;
    @NotBlank
	private String Referance;
    @NotBlank
	private String nom_client;
    @NotBlank
	private String adresse;
	@Positive
	private String dure;
	 @JsonIgnoreProperties("livrasions")
		private UtilisateurDTO utilisateur;
}
