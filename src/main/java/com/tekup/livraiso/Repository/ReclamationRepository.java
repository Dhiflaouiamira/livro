package com.tekup.livraiso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.livraiso.model.Reclamation;

@Repository
public interface ReclamationRepository  extends JpaRepository<Reclamation, Long> {

}



