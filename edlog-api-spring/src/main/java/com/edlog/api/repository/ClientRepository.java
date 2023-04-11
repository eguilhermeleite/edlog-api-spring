package com.edlog.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edlog.api.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
