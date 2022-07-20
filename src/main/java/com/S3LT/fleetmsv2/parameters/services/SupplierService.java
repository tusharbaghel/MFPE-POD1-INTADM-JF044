package com.S3LT.fleetmsv2.parameters.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.S3LT.fleetmsv2.parameters.models.Supplier;
import com.S3LT.fleetmsv2.parameters.repositories.SupplierRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;

	//Get All Suppliers
	public List<Supplier> findAll(){
		return supplierRepository.findAll();
	}

	//Get Supplier By Id
	public Supplier findById(int id) {
		return supplierRepository.findById(id).orElse(null);
	}

	//Delete Supplier
	public void deleteById(int id) {
		supplierRepository.deleteById(id);
	}

	//Update Supplier
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}

}
