package com.gla.array.level1;

import java.util.Scanner;

public class  Oddevenarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
        } else {

            int[] even = new int[num / 2 + 1];
            int[] odd = new int[num / 2 + 1];

            int Evenindex = 0;
            int Oddindex = 0;

            for (int i = 1; i <= num; ++i) {

                if (i % 2 == 0) {
                    even[Evenindex++] = i;
                } else {
                    odd[Oddindex++] = i;
                }
            }

            System.out.println("Odd numbers:");

            for (int i = 0; i < Oddindex; ++i) {
                System.out.print(odd[i] + " ");
            }

            System.out.println("\nEven numbers:");

            for (int i = 0; i < Evenindex; ++i) {
                System.out.print(even[i] + " ");
            }

            sc.close();
        }
    }
}