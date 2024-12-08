package fundamentalsOfProgramming;

import java.util.*;
public class MatrixLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, size;
        System.out.print("Enter Matrix to Generate: ");
        size = input.nextInt();
        
        i = size;
        
        while (i > 0) {
            for (j = size; j > 0; j--) {
                if (i % 2 == 0) {
                    System.out.print(i * size - (size - j) + "\t");
                } else {
                    System.out.print(i * size - j + 1 + "\t");
                }
            }
            System.out.println();
            i--;
        }
    }
}