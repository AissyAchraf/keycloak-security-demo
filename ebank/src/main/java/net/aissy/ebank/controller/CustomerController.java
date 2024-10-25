package net.aissy.ebank.controller;

import lombok.AllArgsConstructor;
import net.aissy.ebank.entity.Customer;
import net.aissy.ebank.service.CustomerService;
import org.springframework.security.core.Authentication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers")
    @PreAuthorize("hasAuthority('USER')")
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/mySession")
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }
}
