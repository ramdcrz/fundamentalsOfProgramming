package fundamentalsOfProgramming;

public class Methods3 {

    public static void main(String[] args) {
        int x = 15;
        int y = x - 5;
        number(y, number(x, 42));
        number(y, x + y);
    }

    public static int number(int num1, int num2) {
        System.out.println(num1 + " " + num2);
        return num1 + num2;
    }
}

