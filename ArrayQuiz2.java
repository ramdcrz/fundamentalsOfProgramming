package fundamentalsOfProgramming;

public class ArrayQuiz2 {
	public static void main(String[] args) {
	    int[] array_nums = {0, 0, 1, 0, 3, 0, 5, 0, 6};
	    int i = 0;
	    int l = array_nums.length;

	    for (int j = 0;  j < l; j++) {
	        if (array_nums[j] == 0) {
	            j++;
	        } else {
	            int temp = array_nums[i];
	            array_nums[i] = array_nums[j];
	            array_nums[j] = temp;
	            i++;
	            j++;
	        }
	    }

	    while (i < array_nums.length) {
	        array_nums[i++] = 0;
	    }

	    for (i = 0; i < array_nums.length; i++) {
	        System.out.print(array_nums[i] + " ");
	    }
	    System.out.println();
	}

}
