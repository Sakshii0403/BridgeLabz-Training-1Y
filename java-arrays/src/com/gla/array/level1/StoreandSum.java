package com.gla.array.level1;

import java.util.Scanner;

public class StoreandSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = (double)0.0F;

        int index;
        for (index = 0; index != 10; ++index) {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            if (number <= (double)0.0F) {
                break;
            }

            arr[index] = number;
        }

        System.out.println("\nNumbers entered:");

        for (int i = 0; i < index; ++i) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println("Total sum = " + total);
        sc.close();
    }
}