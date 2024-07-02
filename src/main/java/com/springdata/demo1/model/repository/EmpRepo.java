package com.springdata.demo1.model.repository;

import com.springdata.demo1.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
