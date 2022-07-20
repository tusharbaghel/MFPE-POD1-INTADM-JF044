package com.S3LT.fleetmsv2.parameters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.S3LT.fleetmsv2.parameters.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
