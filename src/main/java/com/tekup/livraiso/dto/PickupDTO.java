package com.tekup.livraiso.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class PickupDTO {

	 @Positive
   	 private String etat_pickup;
	
	 @JsonIgnoreProperties("pickups")
	 private UtilisateurDTO utilisateur;
}
