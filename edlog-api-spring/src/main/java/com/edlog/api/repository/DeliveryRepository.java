package com.edlog.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edlog.api.domain.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

}
