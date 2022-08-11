package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0, rem;
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		while(num > 0) {
			rem = num % 10;
			result = rem + result * 10;
			num = num/10;
		}
		System.out.println("Reverse of a number is : " + result);
	}


	}

}
