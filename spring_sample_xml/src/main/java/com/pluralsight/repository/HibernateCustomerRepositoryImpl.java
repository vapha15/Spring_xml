package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ICustomerRepository#findALl()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customerList = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Bryann");
		customer.setLastName("Hansen");
		
		customerList.add(customer);
		
		return customerList;
	}
}
