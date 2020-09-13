package com.codegym.cms.service;

import com.codegym.cms.entity.Customer;
import com.codegym.cms.exception.ResourceNotFoundException;

import java.util.List;


public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId) throws ResourceNotFoundException;

    void deleteCustomer(int theId) throws ResourceNotFoundException;

    List<Customer> findCustomersByFirstName(String name);
}