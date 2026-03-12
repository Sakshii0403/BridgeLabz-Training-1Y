package com.gla.array.level1;

import java.util.Scanner;

public class  multiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Table = new int[10];

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; ++i) {
            Table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; ++i) {
            System.out.println(number + " * " + i + " = " + Table[i - 1]);
        }

        sc.close();
    }
}