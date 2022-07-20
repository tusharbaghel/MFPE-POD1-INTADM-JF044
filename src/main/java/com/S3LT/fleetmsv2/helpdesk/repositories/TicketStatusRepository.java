package com.S3LT.fleetmsv2.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.S3LT.fleetmsv2.helpdesk.models.TicketStatus;

@Repository
public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {

}
