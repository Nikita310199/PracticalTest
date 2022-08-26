
package org.example.service;
import org.example.model.Product;
public class ProductService {
	public void increasePrice(Product p)   
 
  {
     double newprice;
	 System.out.println(p.getPrice());  //print the price in Product class
	 newprice=p.getPrice()+100; //increase the price in 100 to the original price
   
 
     System.out.println("increase Price is"+newprice); //print the increase price
 
	
  }
}