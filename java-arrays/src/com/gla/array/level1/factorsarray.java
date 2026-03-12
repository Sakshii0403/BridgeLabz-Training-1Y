package com.gla.array.level1;

import java.util.Scanner;

public class factorsarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int Maxfactors = 10;
        int[] factors = new int[Maxfactors];
        int index = 0;

        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {

                if (index == Maxfactors) {
                    Maxfactors *= 2;
                    int[] temp = new int[Maxfactors];

                    for (int j = 0; j < factors.length; ++j) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index] = i;
                ++index;
            }
        }

        System.out.println("Factors of " + number + " are:");

        for (int i = 0; i < index; ++i) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}