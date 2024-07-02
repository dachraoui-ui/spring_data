package com.springdata.demo1.model.DTO;

import com.springdata.demo1.model.entity.Employee;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Integer id;
    private String FirstName;
    private String LastName;
    private Double salary;
    public static EmployeeDTO toDTO(Employee entity){
        return EmployeeDTO.builder()
                .id(entity.getId())
                .FirstName(entity.getFirstName())
                .LastName(entity.getLastName())
                .salary(entity.getSalary())
                .build();
    }
}
