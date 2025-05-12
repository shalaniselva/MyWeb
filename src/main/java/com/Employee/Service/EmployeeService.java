package com.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Dao.EmployeeDao;
import com.Employee.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String getSingle(Employee e) {

		return ed.getSingle(e);
	}

	public String getObj(List<Employee> e) {

		return ed.getObj(e);
	}

	public Employee getEmp(int n) {
		return ed.getEmp(n);
	}

	public List<Employee> getObj() {
		return ed.getObj();
	}

	public String getDel(int a) {

		return ed.getDel(a);
	}

	public String getMod(Employee e, int a) {
		return ed.getMod(e, a);
	}

	public String getChange(Employee e, int a) {

		return ed.getChange(e, a);
	}

}
