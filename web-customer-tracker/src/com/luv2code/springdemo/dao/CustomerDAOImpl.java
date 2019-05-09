package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = s.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> theCustomer = theQuery.getResultList();
		
		
		
		
		
		return theCustomer;
	}

	
	@Override
	public Customer getCustomer(int id) {
		Session s = sessionFactory.getCurrentSession();
		Customer theCustomer = s.get(Customer.class, id);
		return theCustomer;
	}


	@Override
	public void saveOrUpdate(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.save(theCustomer);
	}


	@Override
	public void deleteCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		s.delete(theCustomer);
	}
	
}

