package project2;

public class reverseArray {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 7};

        int[] newArray = reverseArray(numbers);

        for (int i : newArray) {
            System.out.println(i);
        }

    }

    public static int[] reverseArray(int[] array) {

        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
