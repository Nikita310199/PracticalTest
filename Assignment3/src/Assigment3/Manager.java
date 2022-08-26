package Assigment3;


public class Manager extends Member {
private String department;
public Manager(String Name,int Age,int MobileNo,String Address,double Salary,String department ) {
	super(Name,Age,MobileNo,Address,Salary);
	this.department=department;
}
}
