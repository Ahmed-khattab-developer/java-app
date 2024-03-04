package com.mycompany.project1;

public class DeleteDuplicateElements {

    public static void main(String[] args) {
        
        int a[] = {10, 10, 20, 20, 30};
        int n = a.length;
        System.out.println("After Remove Duplicate Array Element..");
        n = removeduplicates(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
    }

    public static int removeduplicates(int arr[], int n) {
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }

}
