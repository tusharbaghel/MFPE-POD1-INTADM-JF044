package com.S3LT.fleetmsv2.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.S3LT.fleetmsv2.helpdesk.models.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
