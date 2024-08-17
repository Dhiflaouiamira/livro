package com.tekup.livraiso.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class ProfilDTO {
	@NotBlank
	private String nom ;
	@NotBlank
	private String prenom;
	@NotBlank
	private String age ; 
    @Email
	private String email ;
	@NotBlank
	private String modp ;
	 @JsonIgnoreProperties("profils")
		private UtilisateurDTO utilisateur;
	

}
