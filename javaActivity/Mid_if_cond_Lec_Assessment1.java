package javaActivity;

public class Mid_if_cond_Lec_Assessment1
{

	public static void main(String[] args)
	{
	    int a = 1, b = 4, c = 0;

		c = b + a * 2;  		// c = 4 + (1) * (2) = 4 + 2 = 6
		b++;             		// b = 4 then b = 5
		a = c * (b - 1) + 7%3;	// a = 6 * (5 - 1) + 1 = 25 
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Value of c is " + c);
	
		if (b > c)				// 5 is not greater than 6, this block won't be executed
		{
			a--;        		
			c++;
		}
		else
		{
		    b--;				// b = 5 then b = 4
		    b += 4;				// b = 4 + 4 = 8
		    c *= 3;				// c = 3 * 6 = 18
		}
		System.out.println();
		System.out.println("Value of a, b, c are " + a + ", " + b + ", " + c + " respectively.");
	}
}