package com.example.curdsreyas.empservice;
//service class->crud operations

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curdsreyas.empentity.EmployeeEntity;
import com.example.curdsreyas.emprepo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository emprepo;
	
	//post data(inserting data into table)
	public EmployeeEntity addEmployee(EmployeeEntity emp) {
		return emprepo.save(emp);
	}
	
	//get data
	public List<EmployeeEntity> getEmployee() {
		return emprepo.findAll();
	}
	
	//delete data
	public void deleteEmployee(int id) {
		emprepo.deleteById(id);
	}
	
	//update data
	public EmployeeEntity updateEmployee(EmployeeEntity emp) {
		
		Integer empid=emp.getEmpid();
		//getempid(user input in postman
		//findById(table data in db)
		EmployeeEntity emp1=emprepo.findById(empid).get();
		emp1.setEmpname(emp.getEmpname());
		return emprepo.save(emp1);		
	}
}
