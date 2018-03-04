package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.ICustomerRepository;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerRepository iCustomerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(ICustomerRepository iCustomerRepository) {
		super();
		this.iCustomerRepository = iCustomerRepository;
	}

	public void setCustomerRepository(ICustomerRepository iCustomerRepository) {
		this.iCustomerRepository = iCustomerRepository;
	}

	@Override
	public List<Customer> findAll(){
		return iCustomerRepository.findAll();
	}
}
