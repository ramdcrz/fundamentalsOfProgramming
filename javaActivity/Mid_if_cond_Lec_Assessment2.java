package javaActivity;

public class Mid_if_cond_Lec_Assessment2
{

	public static void main(String[] args)
	{
	    int x = -1, y = 7, c = 0;

		    c = y + x * -4;  // c = 7 + (-1) * (-4) = 7 + 4 = 11
		    y += c;          // y = 7 + 11 = 18
		    x -= 3;          // x = -1 - 3 = -4
	
		    if (x > 0)
		    {
		        x++;        // -1 is not greater than 0, this block won't be executed
		    }
		    if (c >= 20 || y > 8)
		    {
		        y += x;     // y = 18 + (-4) = 14, 14 > 8 is true so this will be the last execution
		    }
		    else
		    {
		        y %= 3;
		        x *= c;
		        c--;
		    }
		    System.out.println("Value of x is " + x);
		    System.out.println("Value of y is " + y);
		    System.out.println("Value of c is " + c);
	}
}