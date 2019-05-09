package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface Service {

	public List<Customer> getCustomers();

	

	public Customer getCustomer(int id);

	

	public void saveOrUpdate(Customer theCustomer);



	public void deleteCustomer(Customer theCustomer);
}
