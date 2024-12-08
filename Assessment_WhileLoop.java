package fundamentalsOfProgramming;

public class Assessment_WhileLoop {
	public static void main(String[] args) {
		int i = 1, n = 4, s = 1, p = 0;
		while (i <= n) {
		s = i * i;
		p+= s;
		i++;
	}
	System.out.println("The value of s is " + s);
	System.out.println("The value of p is " + p);
	}
}