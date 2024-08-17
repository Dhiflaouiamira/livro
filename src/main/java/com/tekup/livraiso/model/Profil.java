package com.tekup.livraiso.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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

public class Profil {
	@Id
	private Long id;
	@Column(nullable=false)
	private String nom ;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false)
	private String age ; 
	@Column(nullable=false)
	private String email ;
	@Column(nullable=false)
	private String modp ;
	@OneToOne(optional = false)
	@MapsId
	@JoinColumn(name = "id")
	private Utilisateur utilisateur;

	

}
