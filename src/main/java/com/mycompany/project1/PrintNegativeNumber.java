package com.mycompany.project1;

import java.util.Scanner;

public class PrintNegativeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array Limit :");
       
        int l = input.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.printf("Element of a[%d] :", i);
            arr[i] = input.nextInt();
        }
        System.out.println("\nNegative Array Elements...\n");
        for (int n : arr) {
            if (n < 0) {
                System.out.println(n);
            }
        }
    }

}
