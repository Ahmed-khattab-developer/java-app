package com.mycompany.project1;

import java.util.Scanner;

public class AverageValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array Limit :");
       
        int l = input.nextInt();
        int[] arr = new int[l];
        int sum = 0;
        for (int i = 0; i < l; i++) {
            System.out.printf("Element of a[%d] :", i);
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < l; i++) {
            sum = sum + arr[i];
        }

        double ave = sum / l;
        System.out.println("Sum of Array Value : " + sum);
        System.out.println("Average of Array Value : " + ave);
    }
}
