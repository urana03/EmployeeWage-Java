package com.bridgelabz.employeewage;
import java.util.Random;


public class EmployeeWage 
{
	public static final int fullTimeHrs = 1;
	public static final int partTimeHrs = 2;
	public static final int wagePerHr = 20;
	public static final int totalWorkingDays = 20;
	public static final int totalWorkingHrs = 100;
	
	public static int computeWage(){
		
		int empHrs = 0, empWorkingDays=0, totalEmpHrs = 0;
		
		Random ran = new Random();
    	int check = ran.nextInt(3);
    	
    	while(empWorkingDays<=totalWorkingDays && totalEmpHrs <= totalWorkingHrs) {
        	switch(check) {
        		
        	case fullTimeHrs:
        		 
        		empHrs = 8;
        		
        	    break;
        		
        	case partTimeHrs:
        		 
        		empHrs = 4;
        		
        		break;
        		
        	default:
       		 
        		empHrs = 0;
        		
        		break;
        	
        	}
        	totalEmpHrs +=empHrs;
        	
        	empWorkingDays++;
        	
        	}	
    	    int totalEmpWage = totalEmpHrs*wagePerHr;
        	System.out.println("This month's wage of employee: "+totalEmpWage);
    	    return totalEmpWage;
        }
	
	
    public static void main( String[] args )
    {
    	
    	computeWage();
    
    	}

}