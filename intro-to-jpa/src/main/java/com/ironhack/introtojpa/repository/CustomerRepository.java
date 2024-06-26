package com.ironhack.introtojpa.repository;

import com.ironhack.introtojpa.enums.CustomerStatus;
import com.ironhack.introtojpa.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerName(String customerName);
    List<Customer> findByCustomerStatus(CustomerStatus customerStatus);
}