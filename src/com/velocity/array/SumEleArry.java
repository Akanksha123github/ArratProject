package com.velocity.array;

public class SumEleArry {

	public static void main(String[] args) {
		int a[] = {7,9,8,5,3};
		int sum =0;
		int avg =0;  
		for(int i=0; i<a.length; i++) {
		sum = sum+a[i];
		avg = sum/5;
		
		}System.out.println("Sum:: "+sum);
		System.out.println("Avg ::"+avg);
	}

}
