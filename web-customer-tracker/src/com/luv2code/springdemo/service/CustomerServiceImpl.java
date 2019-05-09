package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@org.springframework.stereotype.Service
public class CustomerServiceImpl implements Service {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveOrUpdate(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveOrUpdate(theCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(theCustomer);
	}

}
