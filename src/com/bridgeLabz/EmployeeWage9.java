package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage9 {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int IS_ABSENT_TODAY = 0;
        Random random = new Random();
        int employeeCheck = random.nextInt(2);

        if (employeeCheck == IS_ABSENT_TODAY) {
            System.out.println("Employee is absent today");
        } else {
            System.out.println("Employee is Present today");
        }
    }
}
