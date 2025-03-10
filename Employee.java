import java.util.*;
class Employee{

	//Attributes
	String name;
	int id;
	double salary;
	
	//Constructor
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//Method to display details
	void display(){
		System.out.println("Employee ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary INR: "+salary);
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("John Doe", 101, 50000);
        Employee emp2 = new Employee("Jane Smith", 102, 60000);

        // Display details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}