package institution;

import java.util.Date;

public class Employee {
	
	String empname;
	int empID;
	int salary;
	int empphone;
	String country;
	String street;
	String state;
	String zipcode;
	String city;
	Address address;
	public static  String OrgName;
	
	public Employee()
	{
		
	}
	public Employee(String empname,int empID)
	{
		this.empname=empname;
		this.empID= empID;
		
	}
	
	void setEmpID(int id) {
		empID = id;
		
	
	}
	int getEmpID() {
		return empID;
		
	
	}
	void setAddress (Address add) {
		address = add;
		
	}
	public Address getAddress()
	{
		return address;
		
	}
	public void displayDetails()
	{
		System .out.println("Employee Name:"+empname+"\n"+"Employee ID: "+empID);
		
	}
	
	public static void orgAddress(String orgAddress)
	{
		System.out.println("Cary, NC");
	}
	
	public static void main(String args[])
	{
		Employee e=new Employee("Siri",101);
		e.displayDetails();
		Employee.OrgName="Technodeed";
		System.out.println("organization Name: "+OrgName);
		Employee.orgAddress("NC");
		
		e.setEmpID(101);
		Address a=new Address("514 pemberwich Pl","27519","Cary","USA");
		e.setAddress(a);
		System.out.println(e.getAddress());
	}

	
	
}
