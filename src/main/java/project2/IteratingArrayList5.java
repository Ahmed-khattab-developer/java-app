package project2;

import java.util.ArrayList;

public class IteratingArrayList5 {

    public static void main(String[] args) {

        // Creating an Arraylist of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        //  using standard add() method
        al.add("aaa");
        al.add("aaaaaa");
        al.add(1, "For");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {

            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : al) {
            System.out.print(str + " ");
        }
    }

}
