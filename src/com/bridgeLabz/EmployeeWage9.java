package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage9 {

    private static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
//    public static final int EMP_RATE_PER_HOUR = 20;
//    public static final int NUM_OF_WORKING_DAYS = 2;
//    public static final int MAX_HRS_IN_MONTH = 10;

    public static int computeEmployee(String company, int emp_Rate_Per_Hour, int num_Of_Working_Days, int max_Hours_In_Month)
    {
        Random random = new Random();
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= max_Hours_In_Month && totalWorkingDays < num_Of_Working_Days) {
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
        int totalEmpWage = totalEmpHrs * emp_Rate_Per_Hour;
        System.out.println("Total Employee wage : " + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        computeEmployee("TCS", 20, 2, 10);
        computeEmployee("BridgeLabz", 10, 4, 20);
        computeEmployee("ITC", 30, 5, 30);

    }
}




