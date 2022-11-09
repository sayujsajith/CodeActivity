package com.EmployeeDetails;
class Member
{
	String Name;
	int Age;
	String PhoneNumber;
	String Address;
	int Salary;
	
	void printSalary()
	{
		System.out.println(Salary);
	}
}

class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
    String department;	
}


public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.Name="vavutty";
		e.Age=20;
		e.PhoneNumber="987654321";
		e.Address="Assam";
		e.Salary=50000;
		e.specialization="java developer";
		Manager m=new Manager();
		m.Name="Lachu";
		m.Age=25;
		m.PhoneNumber="897563421";
		m.Address="kerala";
		m.Salary=90000;
		m.department="IT";
		
		System.out.println("Employee Name is:"+e.Name);
		System.out.println("Employee Age is:"+e.Age);
		System.out.println("Employee Phone Number is:"+e.PhoneNumber);
		System.out.println("Employee Address is"+e.Address);
		System.out.println(	"Employee Salary is:"+e.Salary);
		System.out.println("...................");
		System.out.println("Manager Name is:"+m.Name);
		System.out.println("Manager Age is:"+m.Age);
		System.out.println("Manager Phone Number is:"+m.PhoneNumber);
		System.out.println("Manager Address is"+m.Address);
		System.out.println("Manager Salary is:"+m.Salary);
		
		

	}

}
