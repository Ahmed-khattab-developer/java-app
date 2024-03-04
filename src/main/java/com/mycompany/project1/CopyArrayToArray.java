package com.mycompany.project1;

import java.util.Scanner;

public class CopyArrayToArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array Limit :");

        int l = input.nextInt();
        int[] arr = new int[l];
        int[] copyArr = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.printf("Element of a[%d] :", i);
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < l; i++) {
            copyArr[i] = arr[i];
        }

        System.out.print("\nOriginal Array Elements...");
        for (int i = 0; i < l; i++) {
            System.out.printf("\na[%d] = %d", i, arr[i]);
        }

        System.out.print("\n\nCopy Array Elements one to Another Array...");
        for (int i = 0; i < l; i++) {
            System.out.printf("\nc[%d] = %d", i, copyArr[i]);
        }
    }

}
