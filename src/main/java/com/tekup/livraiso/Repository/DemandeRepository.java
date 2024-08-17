package com.tekup.livraiso.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.livraiso.model.Demande;

@Repository
public interface DemandeRepository extends JpaRepository<Demande, Long> {



}
