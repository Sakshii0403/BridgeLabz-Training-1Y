package com.gla.array.level1;

import java.util.Scanner;

public class Tablefrom6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] multiplicationresult = new int[4];

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; ++i) {
            multiplicationresult[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; ++i) {
            System.out.println(number + " * " + i + " = " + multiplicationresult[i - 6]);
        }

        sc.close();
    }
}