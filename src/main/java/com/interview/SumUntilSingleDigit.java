package com.interview;

import java.io.IOException;
import java.util.Scanner;

/**
 * kamal.verma-13-Dec-2024-12:39:31 pm
 */
public class SumUntilSingleDigit {
  
	public static void main(String[] args) throws NumberFormatException, IOException {
		
        System.out.println("Enter the integer: ");

        Scanner s = new Scanner(System.in);
		
		Integer number = s.nextInt();
		
		while(number/10!=0) {
			 number = sumOfNumber(number);
			if(number/10==0) {
				System.out.println(number);
			}
		}
	}
	
	private static Integer sumOfNumber(Integer number) {
		Integer sum=0;
		while(number>0) {
			sum=sum+number%10;
			number = number / 10;
		}
		
		return sum;
	}
	
}
