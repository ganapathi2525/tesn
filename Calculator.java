package com.simpli.fgy;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char operator;
		int a;
		int b;
		Scanner er=new Scanner(System.in);
		System.out.println("Enter the operator:+,-,* or /");
		operator=er.next().charAt(0);
		System.out.println("Enter First Number");
		a=er.nextInt();
		System.out.println("Enter Second Number");
		b=er.nextInt();
		
		switch(operator) {
		case '+':
			int res=a+b;
			System.out.println("addition"+res);
			break;
		case '-':
			int res1=a-b;
			System.out.println("subtraction"+res1);
			break;	
		case '*':
			int res2=a*b;
			System.out.println("multiplication"+res2);
			break;	
		case '/':
			int res3=a/b;
			System.out.println("division"+res3);
			break;	
		default:
			System.out.println("Invalid operation");
			break;
		}
		
	}

}
