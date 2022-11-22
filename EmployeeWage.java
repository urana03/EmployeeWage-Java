package com.bridgelabz.employeewage;
import java.util.Random;


public class EmployeeWage 
{
	public static final int fullTimeHrs = 1;
	public static final int partTimeHrs = 2;
	
	public static int computeWage(String company,int wagePerHr,
			                        int totalWorkingHrs,int totalWorkingDays){
		
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
        	System.out.println("This month's wage of "+company+ " employee: "+totalEmpWage);
    	    return totalEmpWage;
        }
	
	
    public static void main( String[] args )
    {
    	
    	computeWage("Boat",30,80,24);
    	computeWage("Mi",25,100,20);
    
    	}

}