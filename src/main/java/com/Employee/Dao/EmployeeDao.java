package com.Employee.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee.Entity.Employee;
import com.Employee.Repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String getSingle(Employee e) {
		er.save(e);
		return "POST SINGLEOBJECT SUCCESSFULLY";
	}
	public String getObj(List<Employee> e) {
		er.saveAll(e);
		return "POST LIST ADD SUCCESSFULLY";
	}
	public Employee getEmp(int n) {	
		return er.findById(n).get();
	}
	public List<Employee>getObj(){
		return er.findAll();
	}
	public String getDel(int a) {
		 er.deleteById(a);
		 return "DELETE SUCCESSFULL";
	}
	public String getMod(Employee e,int a) {
	Employee e1=er.findById(a).get();
	e1.setName(e.getName());
	e1.setAge(e.getAge());
	e1.setSalary(e.getSalary());
	e1.setExp(e.getExp());
	e1.setGender(e.getGender());
	er.save(e1);
	
		return "Modify SuccessFul";
	}
	public String getChange(Employee e, int a) {
		Employee e1=er.findById(a).get();
		e1.setName(e.getName());
		er.save(e1);
		return "MODIFY SUCCESSFULL";
	}
}
