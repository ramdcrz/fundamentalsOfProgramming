package fundamentalsOfProgramming;

import java.util.*;

public class Methods2 {
	
	public static void main(String[] args) {
		int[] array = {2, 4, 6, 8, 1, 3, 5, 7};

		int num = 0;

		for (int i = 0; i < array.length; i++)

			num += array[i];

		System.out.print(num);
    }
}

