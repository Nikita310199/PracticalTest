package Assigment3;

public class Main {
	public static void main(String[] args) {
		Employee emp=new Employee("sai",30,68789879,"Mumbai",40000,"IT");
		
		Manager mng=new Manager("ram",30,68789879,"Mumbai",40000,"IT");
		emp.printSalary();
		mng.printSalary();
		
	}
}
