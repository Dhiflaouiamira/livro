package com.tekup.livraiso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.livraiso.model.Livraison;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Long> {

}
