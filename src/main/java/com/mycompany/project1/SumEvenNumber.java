package com.mycompany.project1;

import java.util.Scanner;

public class SumEvenNumber {

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
        for (int e : arr) {
            if (e % 2 == 0) {
                sum = sum + e;
            }
        }
        System.out.println("Sum of Even Array Elements : " + sum);
    }

}
