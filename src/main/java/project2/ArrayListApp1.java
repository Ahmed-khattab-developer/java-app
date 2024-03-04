package project2;

import java.util.*;

public class ArrayListApp1 {

    public static void main(String[] args) {

        // Size of the
        // ArrayList
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arr1 = new ArrayList(n);

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList();

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);
        }

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        
        // 1. Adding Elements

    }
}
