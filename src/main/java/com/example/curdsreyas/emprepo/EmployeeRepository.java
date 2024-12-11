package com.example.curdsreyas.emprepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curdsreyas.empentity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer>{

}
