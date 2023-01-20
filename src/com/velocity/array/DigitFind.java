package com.velocity.array;

public class DigitFind {

	public static void main(String[] args) {
		//Write a program to find digit of number
		int num = 12676;
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
      System.out.println(count);
	}

}
