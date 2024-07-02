package com.springdata.demo1.controller;

import com.springdata.demo1.model.entity.Employee;
import com.springdata.demo1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmpService empService;
    @GetMapping("get_emp")
    public Employee getEmp(@RequestParam Integer id ){
        return this.empService.getEmp(id);
    }
    @PostMapping("save_emp")
    public Employee SaveEmp(@RequestBody Employee employee){
        return this.empService.SaveEmp(employee);
    }
    @GetMapping("delete_emp")
    public void deleteEmp(@RequestParam Integer id){
        empService.deleteEmp(id);
    }
    @PostMapping("update_emp")
    public Employee updateEmp(@RequestBody Employee employee){
        return this.empService.SaveEmp(employee);
    }

}
