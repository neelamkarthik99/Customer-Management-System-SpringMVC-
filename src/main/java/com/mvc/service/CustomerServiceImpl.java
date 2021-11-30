package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.dao.CustomerDAO;
import com.mvc.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomers() 
	{
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void save(Customer theCustomer) 
	{
		customerDAO.save(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theid) 
	{
		return customerDAO.getCustomer(theid);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theid) 
	{
		customerDAO.deleteCustomer(theid);
	}

}
