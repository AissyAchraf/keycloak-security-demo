package net.aissy.ebank.service;

import lombok.AllArgsConstructor;
import net.aissy.ebank.entity.Customer;
import net.aissy.ebank.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
}
