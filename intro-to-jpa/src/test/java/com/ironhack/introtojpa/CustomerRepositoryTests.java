package com.ironhack.introtojpa;

import com.ironhack.introtojpa.enums.CustomerStatus;
import com.ironhack.introtojpa.models.Customer;
import com.ironhack.introtojpa.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerRepositoryTests {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer("John Doe", CustomerStatus.GOLD, 5000);
        customerRepository.save(customer);
        assertNotNull(customer.getCustomerId());
    }

    @Test
    public void testFindCustomerByName() {
        List<Customer> customers = customerRepository.findByCustomerName("John Doe");
        assertFalse(customers.isEmpty());
    }

    @Test
    public void testFindCustomerByStatus() {
        List<Customer> customers = customerRepository.findByCustomerStatus(CustomerStatus.GOLD);
        assertFalse(customers.isEmpty());
    }
}
