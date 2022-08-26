package org.module;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//int i,j;
int star=2;
for(int i=0;i<7;i++){// this loop is used to print lines  
	System.out.print(0+"\t"); 
         for(int j=1;j<=i;j++){// this loop is used to print numbers in a line  
        	 System.out.print(star*j+"\t"); 
               
                 }  
         System.out.println();  
         if(i>0)
         {
        	 star++;
         }
             }  
	}
	} 