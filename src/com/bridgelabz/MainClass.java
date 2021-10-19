package com.bridgelabz;

public class MainClass
{ 
    public static void main (String[] args) 
    { 
        Class derived = new Class(); 
  
        // calling the method implemented within the class. 
        derived.showFirstInterface();
        derived.showSecondInterface(); 
        derived.showFirstClass();    
    } 
}

	class FirstClass
	{
	    void showFirstClass()
	    {
	        System.out.println("This is the method of FirstClass");
	    }
	}
	class Class extends FirstClass implements FirstInterface, SecondInterface 
	{
		@Override
	    public void showFirstInterface() 
	    {
	        System.out.println("It is implementation of First interface");
	    } 
		
	    @Override
	    public void showSecondInterface() 
	    {
	        System.out.println("It is implementation of Second interface");
	    }
	    
	}