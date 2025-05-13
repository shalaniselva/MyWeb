package StreamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Dev", 56553, "Developer", "Male");
		Employee e2 = new Employee("Shalini", 78900, "JavaDeveloper", "female");
		Employee e3 = new Employee("Mari", 67000, "TL", "female");
		Employee e4 = new Employee("Dhanush", 169870, "Supervisor", "male");
		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);
		
		// second max using for
		
		ArrayList<Employee>em=new ArrayList<>();
         em.add(e1);
         em.add(e2);
         em.add(e3);
         em.add(e4);
         
         Employee max=e1;
         Employee Smax1=e1;
         for(Employee x:em) {
        	if(x.getSalary()>max.getSalary()) {
        		max=x;
        	}
         }
         for(Employee y:em) {
        	 if(y.getSalary()>Smax1.getSalary() && y.getSalary()!= max.getSalary()) {
        		Smax1=y;
        	}
         }
         System.out.println(Smax1.getSalary());
         
         // print the java developers only
		
		List<Employee> hike = emps.stream().filter(x -> x.getRole().equals("JavaDeveloper"))
				.map(x -> new Employee(x.getName(), (x.getSalary() + x.getSalary() * 10 / 100), x.getRole(), x.getGender()))
				.toList();
		System.out.println(hike);

		// finding third max

		int tMax = emps.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(tMax);

		// find the second max

		int Smax = emps.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(Smax);

		// employee is a developer show the salary of employee
		List<Integer> sal=emps.stream().filter(x-> x.getRole().equals("Developer")).map(y-> y.getSalary()).collect(Collectors.toList());
		System.out.println(sal);
		
		Employee list=emps.stream().filter(x -> x.getSalary()>=25000)
			    .sorted( Comparator.comparing(Employee::getSalary).reversed())        
			   .sorted(Comparator.comparing(Employee::getName).reversed()).findFirst().get();
	       System.out.println(list);

	}
}

class Employee {
	private String name;
	private int salary;
	private String role;
	private String gender;

	public Employee(String name, int salary, String role, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.gender = gender;
	}

	public String toString() {
		return "name=" + name + ", salary=" + salary + ", role=" + role + ", gender=" + gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}