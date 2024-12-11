package com.example.curdsreyas.empcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//controller class
import org.springframework.web.bind.annotation.RestController;

import com.example.curdsreyas.empentity.EmployeeEntity;
import com.example.curdsreyas.empservice.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	public EmployeeService empser;
	
	@PostMapping("/addemp")
	public EmployeeEntity regEmployee(@RequestBody EmployeeEntity emp) {
		return empser.addEmployee(emp);
	}
	
	@GetMapping("/getemp")
	public List<EmployeeEntity> getEmp() {
		return empser.getEmployee();
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmp(@PathVariable Integer id) {
		empser.deleteEmployee(id);
	}
	
	@PutMapping("/updateemp")
	public EmployeeEntity updateEmp(@RequestBody EmployeeEntity emp) {
		return empser.updateEmployee(emp);
	}

}
