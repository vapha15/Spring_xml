package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Customer;

public interface ICustomerRepository {

	List<Customer> findAll();

}