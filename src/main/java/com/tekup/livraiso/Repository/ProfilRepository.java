package com.tekup.livraiso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.livraiso.model.Profil;

@Repository
public interface ProfilRepository  extends JpaRepository<Profil, Long> {

}


