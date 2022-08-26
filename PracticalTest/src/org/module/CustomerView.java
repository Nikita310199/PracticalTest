package org.module;

public class CustomerView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Customer customer=new Customer(234,"saibaba",31);
   CustomerService c=new CustomerService();
   boolean eligible;
   System.out.println(customer);
   eligible=c.chekEligibility(customer);
   if(eligible) {
	   System.out.println("You are eligible for voting");
   }
   else
   {
	   System.out.println("you are not eligible for voting");
   }
	}

}
