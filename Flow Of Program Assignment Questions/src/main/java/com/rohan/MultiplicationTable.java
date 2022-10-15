package com.rohan;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int num = in.nextInt();
        System.out.println("The Multiplication table for "+num);
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
