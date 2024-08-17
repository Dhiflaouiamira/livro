package com.tekup.livraiso.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class  EvaluationDTO  {
	@Positive
	private String note;
	 @JsonIgnoreProperties("evaluations")
		private UtilisateurDTO utilisateur;
}