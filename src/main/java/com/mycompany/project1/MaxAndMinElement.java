package com.mycompany.project1;

import java.util.Scanner;

public class MaxAndMinElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array Limit :");
        int l = input.nextInt();
        int[] arr = new int[l];
        int max = 0, min = 0;
        for (int i = 0; i < l; i++) {
            System.out.printf("Element of a[%d] :", i);
            arr[i] = input.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < l; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Element of Array : " + max);
        System.out.println("Minimum Element of Array : " + min);
    }
}
