package service;

public class Calculator {
	
	public int calculateDifference(int n) {
		int sumOfn=0;
		int sumSquare=0;
		//sum of n natural number
		sumOfn=(n*(n+1))/2;
		//square of sumOfn.
		int sumSqr=sumOfn*sumOfn;
		//sum of square of each natural number.
		for (int i=0; i<=n; i++) {
			sumSquare=sumSquare+(i*i);
		}
		//Difference
		int diff=sumSquare-sumSqr;
		
		//if diff is negative
		if(diff<0) {
			return -diff;
		}else {
			return diff;
		}
	}
	
	
	public int calculateSum(int n) {
		int sum=0;
		for(int i=0; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	
	//Check Number if it is Increasing.
	public boolean checkIncreasing(int n) {
		//Getting length of Number.
		int length = (int) (Math.log10(n) + 1);
		int temp1=0, temp2=0;
		
		for(int i=1; i<=length; i++) {
			temp1 = n%10;
			n=n/10;
			temp2=n%10;
			if(temp1<temp2) {
				break;
			}
			if(i==length) {
				return true;
			}	
		}
		return false;
	}
		
		
//	Check if Number Is power of 2
	public boolean checkpowOfTwo(int n) {
		int result=2;
		boolean ans=false;
//		do{
//			result=result*2;
//			if(result==n) {
//				ans=true;
//				break;
//			}
//		}while(result<=n);\
		if(n<0) {
			return ans;
		}
		while(result<=n) {
			if(result==n) {
				ans=true;
				break;
			}
			result=result*2;
		}
		return ans;
	}
}