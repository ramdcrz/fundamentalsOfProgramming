package fundamentalsOfProgramming;

public class Quiz2 {

public static void main(String args[]) {
	int a = 10;
	int b; int c; int d; int e; int f; int g; int h; int i; int j;
	a += 5;
	a /= 3;
	a *= 4;
	a -= 5;
	b = a;
	c = b;
	a <<= 2;
	b >>= 2;
	d = b;
	e = b;
	e >>>= 1;
	f = b;
	f %= 3;
	g = a;
	g %= 4;
	h = b;
	h &= 2;
	i = b;
	i &= 12;
	i += 5;
	j = a+b+c+d+e+f+g+h+i;
	
	System.out.println("a= " + a);
	System.out.println("b= " + b);
	System.out.println("c= " + c);
	System.out.println("d= " + d);
	System.out.println("e= " + e);
	System.out.println("f= " + f);
	System.out.println("g= " + g);
	System.out.println("h= " + h);
	System.out.println("i= " + i);
	System.out.println("j= " + j);
	}
}
