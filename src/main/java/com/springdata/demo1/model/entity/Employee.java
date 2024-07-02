package com.springdata.demo1.model.entity;

import com.springdata.demo1.model.DTO.EmployeeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "employees")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer id;
    @Column(name = "first_name")
    private String FirstName;
    @Column(name = "last_name")
    private String LastName;
    private Double salary;
    public static Employee toEntity(EmployeeDTO dto){
        return Employee.builder()
                .id(dto.getId())
                .FirstName(dto.getFirstName())
                .LastName(dto.getLastName())
                .salary(dto.getSalary())
                .build();
    }



}
