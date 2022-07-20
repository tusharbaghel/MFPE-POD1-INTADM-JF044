package com.S3LT.fleetmsv2.hr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.S3LT.fleetmsv2.hr.models.EmployeeStatus;

@Repository
public interface EmployeeStatusRepository extends JpaRepository<EmployeeStatus, Integer> {
}
