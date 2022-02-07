package com.simpli.learn;

public class LocalInnerClass {
	 void validate(int age)
	 {
		 if(age >=18)
		 {
			 class Inner
			 {
				 void test()
				 {
					 System.out.println("authnticate aadhaar");
				 }
			 }
			 Inner inn=new Inner();
			 inn.test();
		 }
			 
	 }
	 public static void main(String[] args) {
		LocalInnerClass m2=new LocalInnerClass();
		m2.validate(45);
				
	}

}
