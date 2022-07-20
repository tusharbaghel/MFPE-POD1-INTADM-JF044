package com.S3LT.fleetmsv2.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.S3LT.fleetmsv2.accounts.models.TransactionType;

@Repository
public interface TransactionTypeRepository extends JpaRepository<TransactionType, Integer> {
}
