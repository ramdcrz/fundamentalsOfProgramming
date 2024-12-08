package fundamentalsOfProgramming;

public class ArrayQuiz1 {

	public static void main(String[] args) {
	    int a[] = {4, 8, 6, 3, 2};
	    int[] b = new int[a.length + 1];
	    int h = a[0];
	    int sh = a[0];
	    int j = 0;

	    for (int i = 0; i < a.length; i++) {
	        if (a[i] > h) {
	            h = a[i];
	            j = i;
	        }
	    }

	    for (int i = 0; i < a.length; i++) {
	        if (a[i] < h && a[i] > sh) {
	            sh = a[i];
	        }
	    }

	    for (int i = 0; i < j; i++) {
	        b[i] = a[i];
	    }

	    b[j] = sh;
	    b[j + 1] = h - sh;

	    for (int i = j + 2; i < b.length; i++) {
	        b[i] = a[i - 1];
	    }

	    for (int i = 0; i < b.length; i++) {
	        System.out.print(b[i] + " ");
	    }
	}


}
