package com.rohan;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double num1 = in.nextDouble();
        System.out.println("Enter second number : ");
        double num2 = in.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum of the two numbers is :" + sum);
    }
}
