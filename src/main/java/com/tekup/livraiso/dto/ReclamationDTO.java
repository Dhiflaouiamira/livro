package com.tekup.livraiso.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data

public class ReclamationDTO {
	 @NotBlank
	private String nom ;
    @NotBlank
	private String referance;
    @JsonIgnoreProperties("reclamations")
	private UtilisateurDTO utilisateur;
	

}
