package com.simpli.learn;

public class MethodLocalInnerClass {
	public void display()
	{
		class Inner
		{
			void myMethod()
			{
				System.out.println("Method from Inner class");
			}
		}
		Inner n=new Inner();
		n.myMethod();
	}
	public static void main(String[] args) {
		MethodLocalInnerClass m1=new MethodLocalInnerClass();
		m1.display();
		
	}

}
