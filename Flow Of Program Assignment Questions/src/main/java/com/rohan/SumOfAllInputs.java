package com.rohan;

import java.util.Locale;
import java.util.Scanner;

public class SumOfAllInputs {
    public static void main(String[] args) {
        System.out.println("Enter number to find their sum and then x to exit: ");
        Scanner in = new Scanner(System.in);
        double sum = 0, num;
        String input;
        boolean flag= true;
        while(flag) {
            input = in.next();
            //fails when user enters an char other than "x"
            if(input.toLowerCase().equals("x"))
                flag = false;
            else {
                num = Double.parseDouble(input);
                sum = num+sum;
            }
        }
        System.out.println("Sum of all inputs is: "+sum);
    }
}
