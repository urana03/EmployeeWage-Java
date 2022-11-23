package com.bridgelabz.employeewage;
import java.util.Random;


public class EmployeeWage 
{
	public static final int fullTimeHrs = 1;
	public static final int partTimeHrs = 2;
	
	private final String company;
	private final int wagePerHr;
	private  final int totalWorkingHrs;
	private  final int totalWorkingDays;
	private int totalEmpWage;
	
	public EmployeeWage(String company,int wagePerHr,
			                        int totalWorkingHrs,int totalWorkingDays) {
		
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.totalWorkingHrs= totalWorkingHrs;
		this.totalWorkingDays = totalWorkingDays;
		
	}
	
	public void computeWage(){
		
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
    	    
    	totalEmpWage = totalEmpHrs*wagePerHr;
        
        }
	   @Override
	   public String toString() {
		   
		  return "Total Employee Wage of "+company+ " is: " +totalEmpWage;
	  }
	
    public static void main(String args[])
    {
        EmployeeWage boat = new EmployeeWage("Boat",30,200,24);
        EmployeeWage Mi = new EmployeeWage("Mi",25,100,20);
        boat.computeWage();
        System.out.println(boat);
        Mi.computeWage();
        System.out.println(Mi);
        
        }

}