package com.tekup.livraiso.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data

public class AdresseDTO {
	 @NotBlank
	private String ville;
	 @NotBlank
	private String codepostal;
	 @JsonIgnoreProperties("adresses")
		private UtilisateurDTO utilisateur;
}
