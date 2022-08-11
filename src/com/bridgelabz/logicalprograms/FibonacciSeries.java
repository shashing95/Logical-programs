package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Fibonnaci numbers upto " + num + " terms : ");
		for (int i = 1; i <= num; i++) {
			System.out.println(a);
			int result = a + b;
			a = b;
			b = result;
		}
	}

}
