package com.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Service.EmployeeService;

@RestController
public class EmployeeController {
   @Autowired
   EmployeeService es;
   @PostMapping(value="/getSingle")
   public String getSingle(@RequestBody Employee e) {
	   return es.getSingle(e);
   }
   @PostMapping(value="/getList")
   public String getObj(@RequestBody List<Employee> e) {
	   return es.getObj(e);
   }
   @GetMapping(value="/getObject/{n}")
   public Employee getEmp(@PathVariable int n) {
	   return es.getEmp(n);
   }
   @GetMapping(value="/getObj")
   public List<Employee>getObj(){
	   return es.getObj();
   }
   @DeleteMapping(value="/getDel/{a}")
   public String getDel(@PathVariable int a) {
	   return es.getDel(a);
   }
   @PutMapping(value="/getPut/{a}")
   public String getMod(@RequestBody Employee e,@PathVariable int a) {
	   return es.getMod(e,a);
   }
   
   @PatchMapping(value="/getVal/{a}")
   public String getChang(@RequestBody Employee e,@PathVariable int a) {
	   return es.getChange(e,a);
   }
}
