package com.bridgelabz.employeewage;
import java.util.Random;

public class EmployeeWage 
{
    public static void main( String[] args )
    {
    	Random ran = new Random();
    	int check = ran.nextInt(2);
    	
    	int wagePerHr = 20;
    	int fullTimeHrs = 8;
    	int partTimeHrs = 4;
    	int dailyEmpWage = 0;
    	
    	if(check == 0) {
    		
    		dailyEmpWage = fullTimeHrs*wagePerHr;
    		System.out.println("Full Time Employee Wage: "+ dailyEmpWage);
    	}
    	else {
    		dailyEmpWage = partTimeHrs*wagePerHr;
    	    System.out.println("Part Time Employee Wage: "+ dailyEmpWage);
    	}
    	
    	
    	
    }
}
