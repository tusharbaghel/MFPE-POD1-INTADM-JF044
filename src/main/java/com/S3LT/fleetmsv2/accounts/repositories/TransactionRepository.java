package com.S3LT.fleetmsv2.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.S3LT.fleetmsv2.accounts.models.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
