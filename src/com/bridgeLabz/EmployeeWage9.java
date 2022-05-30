package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage9 {

    private static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static int computeEmployee(){

        Random random = new Random();
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int employeeCheck = random.nextInt(4);
             switch (employeeCheck) {
                 case IS_PART_TIME:
                    empHrs = 4;
                    break;
                 case IS_FULL_TIME:
                     empHrs = 8;
                     break;
                 default:
                     empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Working days:- "+ totalWorkingDays + " === Employee working hours:- " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee wage : " + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        computeEmployee();

    }
}




