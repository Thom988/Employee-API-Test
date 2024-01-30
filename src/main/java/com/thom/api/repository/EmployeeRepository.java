package com.thom.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thom.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
