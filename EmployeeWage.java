package com.bridgelabz.employeewage;
import java.util.Random;

public class EmployeeWage 
{
    public static void main( String[] args )
    {
    	Random ran = new Random();
    	int check = ran.nextInt(2);
    	
    	int wagePerHr = 20;
    	int dailyEmpWage = 0;
    	int totalWage = 0;
    	
    	int fullTimeHrs = 8;
    	int partTimeHrs = 4;
    	
    	
    	int empWorkingDays = 20;
    	int totalWorkingDays=0;
    	
    	while(totalWorkingDays<=empWorkingDays) {
    	switch(check) {
    		
    	case 0:
    		 fullTimeHrs = 8;
    		 dailyEmpWage = fullTimeHrs*wagePerHr;
    		 totalWage = totalWage+dailyEmpWage;
    	    break;
    		
    	case 1:
    		 partTimeHrs = 4;
    		 dailyEmpWage = partTimeHrs*wagePerHr;
    		 totalWage = totalWage+dailyEmpWage;
    		break;
    	
    	}
    	totalWorkingDays++;
    	
    	}	
    	System.out.println("This month's wage of employee: "+totalWage);
    }
}
