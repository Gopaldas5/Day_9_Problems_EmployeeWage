package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage9 {

    private static final double IS_PART_TIME = 1;
    public static  final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        Random random = new Random();

        for (int day=0; day<NUM_OF_WORKING_DAYS; day++) {
            int employeeCheck = random.nextInt(2);
            empHrs = switch (employeeCheck) {
                case (int) IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee wage : " + empWage);
        }
        System.out.println("Total Employee wage : "+totalEmpWage);
        }
    }

