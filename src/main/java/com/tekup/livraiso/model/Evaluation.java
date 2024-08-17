package com.tekup.livraiso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Evaluation {
	@Id
	private Long id;
	@Column(nullable=false)
	private String note;
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	private Utilisateur utilisateur;
	
}
