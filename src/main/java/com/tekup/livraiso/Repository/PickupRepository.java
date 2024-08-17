package com.tekup.livraiso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.livraiso.model.Pickup;



@Repository
public interface PickupRepository extends JpaRepository<Pickup, Long> {

}