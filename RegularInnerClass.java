package com.simpli.learn;

public class RegularInnerClass {
	private int a=10;
	class Inner
	{
		public void display()
		{
			System.out.println("welcome to inner class");
			System.out.println("value of a "+a);
			
		}
	}
    public static void main(String[] args) {
    	RegularInnerClass outer=new RegularInnerClass();
    	RegularInnerClass.Inner inner=outer.new Inner();
    	inner.display();
		
	}
}
