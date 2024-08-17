package com.tekup.livraiso.Repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.livraiso.model.Utilisateur;



@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	Optional <Utilisateur> findByEmail(String email);
}
