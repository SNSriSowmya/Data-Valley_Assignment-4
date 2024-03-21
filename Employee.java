//Write a java program to create linked list with employee objects, sort the all object based name of employee and salary of employee.
//Note: take Employee as a class with id, name, designation and salary fields


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Emply {
	private int id;
	private String name;
	private String designation;
	private double salary;
	
	public Emply(int id, String name, String designation, double salary) {

		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDesignation() {
		return designation;
	}


	public double getSalary() {
		return salary;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
}

public class Employee{
	public static void main(String[] args) {
		LinkedList<Emply> employees=new LinkedList<>();
		employees.add(new Emply(1,"chanti","S/W Manager",10000));
		employees.add(new Emply(2,"honey","QA Manager",20000));
		employees.add(new Emply(3,"abhi","Product Manager",30000));
		employees.add(new Emply(4,"dhoni","Finance Manager",40000));
		
		System.out.println("Before Sorting");
		for(Emply employee:employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees, Comparator.comparing(Emply::getName));

        System.out.println("\nAfter sorting by name:");
        for (Emply employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, Comparator.comparing(Emply::getSalary));

        System.out.println("\nAfter sorting by salary:");
        for (Emply employee : employees) {
            System.out.println(employee);
        }
	}
}