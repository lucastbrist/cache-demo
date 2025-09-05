package com.ltb.cache_demo.repositories;

import com.ltb.cache_demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {
}
