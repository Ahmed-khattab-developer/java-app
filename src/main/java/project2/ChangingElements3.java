package project2;

import java.util.ArrayList;

public class ChangingElements3 {

    public static void main(String[] args) {

        // Creating an Arraylist object of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to Arraylist
        // Custom input elements
        al.add("aa");
        al.add("aaaa");

        // Adding specifying the index to be added
        al.add(1, "aaaaa");

        // Printing the Arraylist elements
        System.out.println("Initial ArrayList " + al);

        // Setting element at 1st index
        al.set(1, "For");

        //  Printing the updated Arraylist
        System.out.println("Updated ArrayList " + al);
    }

}
