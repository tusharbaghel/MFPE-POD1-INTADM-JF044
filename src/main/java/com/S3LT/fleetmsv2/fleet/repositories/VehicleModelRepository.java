package com.S3LT.fleetmsv2.fleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.S3LT.fleetmsv2.fleet.models.VehicleModel;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
