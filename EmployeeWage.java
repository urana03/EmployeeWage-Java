package com.bridgelabz.employeewage;
import java.util.Random;

public class EmployeeWage 
{
    public static void main( String[] args )
    {
    	Random ran = new Random();
    	int check = ran.nextInt(2);
    	if(check == 0) {
    		System.out.println("Employee is present.");
    	}
    	else {
    	    System.out.println("Employee is absent.");
    	}
    	
    	
    }
}
