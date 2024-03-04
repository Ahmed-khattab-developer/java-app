package project2;

public class MultiArray {

    public static void main(String[] args) {
        double[][][] scores = {
            {{1.2, 2.1}, {1.5, 2.5}},
            {{5.4, 8.7}, {9.5, 7.8}}
        };

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                for (int k = 0; k < scores[i][j].length; k++) {
                    System.out.print(scores[i][j][k] + "\t");
                }
            }
            System.out.println("");
        }
    }
}
