package project2;

import java.util.ArrayList;

public class AddingElements2 {

    public static void main(String[] args) {

        // Creating an Array of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        // Custom inputs
        al.add("aaa");
        al.add("aaaa");

        // Here we are mentioning the index
        // at which it is to be added
        al.add(1, "For");

        // Printing all the elements in an ArrayList
        System.out.println(al);

    }
}
