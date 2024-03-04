package project2;

import java.util.ArrayList;

public class RemovingElements4 {

    public static void main(String[] args) {

        // Creating an object of arraylist class
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        // Custom addition
        al.add("aaaa");
        al.add("aaaaaaa");
        // Adding element at specific index
        al.add(1, "For");

        // Printing all elements of ArrayList
        System.out.println("Initial ArrayList " + al);

        // Removing element from above ArrayList
        al.remove(1);

        // Printing the updated Arraylist elements
        System.out.println("After the Index Removal " + al);

        // Removing this word element in ArrayList
        al.remove("aaaa");

        // Now printing updated ArrayList
        System.out.println("After the Object Removal " + al);

    }

}
