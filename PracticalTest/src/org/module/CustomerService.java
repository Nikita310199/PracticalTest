package org.module;

public class CustomerService {
	public boolean chekEligibility(Customer C) {
		System.out.println(C.getAge);
		if(C.getAge()>=18) {
			return true;
		}
		else {
			return false;
		}
	}

}
