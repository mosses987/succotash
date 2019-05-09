package com.luv2code.springdemo.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.Service;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private Service service;
	

	@GetMapping("/showFormForAdd")
	public String newCustomer(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "add-customer";
	}
	
	@GetMapping("/deleteForm")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		
		Customer theCustomer = service.getCustomer(id) ;
		
		service.deleteCustomer(theCustomer);
		
		
		
		return "redirect:/customer/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String updateCustomer(@RequestParam("customerId") int id ,Model theModel) {
		System.out.println("Hello");
		Customer theCustomer = service.getCustomer(id);
		theModel.addAttribute("customer", theCustomer);
		
		return "add-customer";
	}
	
	@GetMapping("/list")
	public String customerList(Model theModel) {
		
		
		List<Customer> theCustomers = service.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		
		
	
		
		return "list-customer";
		
		
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomers(@ModelAttribute("customer") Customer theCustomer) {
		
		service.saveOrUpdate(theCustomer);
		return "redirect:/customer/list";
	}
	
	
}
