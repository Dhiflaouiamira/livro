package com.tekup.livraiso.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.livraiso.model.Adresse;



@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {


	

}
