package com.mycompany.project1;

import java.util.Scanner;

public class PrintOddNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array Limit :");
        int l = input.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.printf("Element of a[%d] :", i);
            arr[i] = input.nextInt();
        }
        System.out.println("\nOdd Array Elements...\n");
        for (int o : arr) {
            if (o % 2 == 1) {
                System.out.println(o);
            }
        }

    }
}
