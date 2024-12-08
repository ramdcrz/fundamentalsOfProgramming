package fundamentalsOfProgramming;

public class ArrayQuiz3 {
    public static void main(String[] args) {
        int r, c; // This variable isn't used in the code
        int[][] num = new int[4][4];
        int number = 4;

        for (r = 0; r < num.length; r++) {
            for (c = 0; c < num[r].length; c++) {
                num[r][c] = number;
                number--;
            }
            number += 5;
        }

        for (int a = num.length - 1; a >= 0; a--) {
            for (int b = 0; b < num[a].length; b++) {
                System.out.print(num[a][b] + "_");
            }
            System.out.println();
        }
    }
}