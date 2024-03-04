package project2;

public class AvgDegree {

    public static void main(String[] args) {

        int[] degrees = {1, 4, 8, 15, 99, 155};

        System.out.println(avgDegree(degrees));

    }

    public static double avgDegree(int[] degrees) {

        int sum = 0;

        for (int i = 0; i < degrees.length; i++) {
            sum += degrees[i];
        }
        return sum / degrees.length;
    }
}
