package com.practice.demoMaven.Repository;

import com.practice.demoMaven.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Optional<Customer> findCustomerByEmail(String email);
}
