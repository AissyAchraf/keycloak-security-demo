package net.aissy.ebank.service;

import net.aissy.ebank.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
    Customer getCustomerById(Long id);
}
