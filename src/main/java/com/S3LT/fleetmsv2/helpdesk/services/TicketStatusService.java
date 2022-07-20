package com.S3LT.fleetmsv2.helpdesk.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.S3LT.fleetmsv2.helpdesk.models.TicketStatus;
import com.S3LT.fleetmsv2.helpdesk.repositories.TicketStatusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TicketStatusService {
	
	@Autowired
	private TicketStatusRepository ticketStatusRepository;
	
	//Get All TicketStatuss
	public List<TicketStatus> findAll(){
		return ticketStatusRepository.findAll();
	}	
	
	//Get TicketStatus By Id
	public Optional<TicketStatus> findById(int id) {
		return ticketStatusRepository.findById(id);
	}	
	
	//Delete TicketStatus
	public void delete(int id) {
		ticketStatusRepository.deleteById(id);
	}
	
	//Update TicketStatus
	public void save( TicketStatus ticketStatus) {
		ticketStatusRepository.save(ticketStatus);
	}

}
