package project2;

import java.util.ArrayList;

public class GetElements6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        // add the number 
        list.add(9);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // get method
        Integer n = list.get(1);
        System.out.println("at indext 1 number is:" + n);

    }

}
