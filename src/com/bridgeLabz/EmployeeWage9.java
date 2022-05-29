package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage9 {

    private static final double IS_PART_TIME = 1;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int IS_ABSENT_TODAY = 0;
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;

        Random random = new Random();
        int employeeCheck = random.nextInt(2);


        if (employeeCheck == IS_PART_TIME)
            empHrs = 4;
        else if (employeeCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage : "+empWage);;
        }
    }

