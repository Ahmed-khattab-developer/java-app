package com.mycompany.project1;

import java.util.Scanner;

public class PrintSumValues {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Element of a[%d] :", i);
            arr[i] = input.nextInt();
        }

        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum Values of Array : " + sum);
    }

}
