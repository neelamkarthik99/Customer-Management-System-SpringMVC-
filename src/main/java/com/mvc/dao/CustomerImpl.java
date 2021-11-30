package com.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mvc.entity.Customer;


@Repository
public class CustomerImpl implements CustomerDAO 
{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() 
	{
		Session currentsession = sessionFactory.getCurrentSession();
		Query<Customer> query = currentsession.createQuery("from Customer",Customer.class);
		List<Customer> customer = query.getResultList();
		return customer;
	}

	@Override
	public void save(Customer theCustomer) 
	{
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theid) 
	{
		Session currentsession = sessionFactory.getCurrentSession();
		Customer customer = currentsession.get(Customer.class, theid);
		return customer;
	}

	@Override
	public void deleteCustomer(int theid) 
	{
		Session currentsession = sessionFactory.getCurrentSession();
		Customer customer = currentsession.get(Customer.class, theid);
		currentsession.delete(customer);		
	}

}
