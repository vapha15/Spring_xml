package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;

public interface ICustomerService {

	List<Customer> findAll();

}