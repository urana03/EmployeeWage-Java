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
    	
    	
    	int totalWorkingDays = 20;
    	int empWorkingDays=0;
    	
    	int totalWorkingHrs = 100;
    	int perDayHrs = 0;
    	
    	while(empWorkingDays<=totalWorkingDays || perDayHrs<=totalWorkingHrs) {
    	switch(check) {
    		
    	case 0:
    		 fullTimeHrs = 8;
    		 perDayHrs = perDayHrs + fullTimeHrs;
    		 
    		 dailyEmpWage = fullTimeHrs*wagePerHr;
    		 totalWage = totalWage+dailyEmpWage;
    	    break;
    		
    	case 1:
    		 partTimeHrs = 4;
    		 perDayHrs = perDayHrs + partTimeHrs;
    		 
    		 dailyEmpWage = partTimeHrs*wagePerHr;
    		 totalWage = totalWage+dailyEmpWage;
    		break;
    	
    	}
    	empWorkingDays++;
    	
    	}	
    	System.out.println("This month's wage of employee: "+totalWage);
    }
}
