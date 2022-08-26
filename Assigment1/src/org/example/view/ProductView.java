
package org.example.view;
import org.example.model.*;
import org.example.model.Product;
import org.example.service.ProductService;

public class ProductView {

	public static void main(String[] args) {
		
	    	  
	    	 Product p= new Product(10,"Sunsilk", 50);
	    	 ProductService psObj= new ProductService();
	    	 psObj.increasePrice(p);
	    	 
	
	}
}