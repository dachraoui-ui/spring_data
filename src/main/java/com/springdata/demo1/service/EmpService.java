package com.springdata.demo1.service;

import com.springdata.demo1.model.entity.Employee;
import com.springdata.demo1.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;
    public Employee getEmp(Integer id ){
        // for the null pointer exception ;
        Optional<Employee> emp = this.empRepo.findById(id);
        if(emp.isPresent())
            return emp.get();
        return new Employee() ;
        // we can replace those 3 lines with
        // return emp.orElse( null ) ;
    }
    public Employee SaveEmp(Employee employee){
        return this.empRepo.save(employee);
    }
    public void deleteEmp(Integer id ){
         empRepo.deleteById(id);
    }
}
