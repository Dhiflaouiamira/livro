package com.tekup.livraiso.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data

public class DemandeDTO {
	 @NotBlank
	private String nom ;
	 @NotBlank
	private String referance;
	 @JsonIgnoreProperties("demandes")
		private UtilisateurDTO utilisateur;

}
