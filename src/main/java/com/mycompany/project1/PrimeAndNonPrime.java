package com.mycompany.project1;

public class PrimeAndNonPrime {

    public static void main(String[] args) {
        int i;
        int j;
        int flag;

        int a[] = {3, 12, 21, 11, 71, 96, 19, 41, 83, 101};

        for (i = 0; i < a.length; i++) {
            flag = 0;
            for (j = 2; j < a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    flag = 1;
                    break;
                }
            }
            System.out.println(a[i] + " - " + (flag == 0 ? "Prime" : "Not Prime"));
        }
        System.out.println();
    }

}
