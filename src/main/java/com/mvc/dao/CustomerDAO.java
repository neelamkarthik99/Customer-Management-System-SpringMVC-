package com.mvc.dao;

import java.util.List;

import com.mvc.entity.Customer;

public interface CustomerDAO 
{
	public List<Customer> getCustomers();

	public void save(Customer theCustomer);

	public Customer getCustomer(int theid);

	public void deleteCustomer(int theid);
}
