package com.mycompany.project1;

import java.util.Scanner;

public class SearchAnElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array Limit :");
       
        int l = input.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.printf("Element of a[%d] :", i);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the Search Array Element :");
        int s = input.nextInt();
        int i, f = 0;
        for (i = 0; i < l; i++) {
            if (arr[i] == s) {
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.printf("The Element is found in the position : %d", i + 1);
            System.out.printf("\nThe Element is found in the index : %d", i);
        } else {
            System.out.println("The Element is Not found");
        }
    }

}
