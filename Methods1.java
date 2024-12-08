package fundamentalsOfProgramming;

public class Methods1 {
    public static void main(String[] args) {
        int value;
        int x = 3;
        System.out.print("A");
        value = checkLength(x);
        System.out.print("B");
        System.out.print(x);
        System.out.print(value);
    }

    public static void loadSong(int id) {
        System.out.print(id);
    }

    public static int checkLength(int id) {
        System.out.print(id);
        id = id + 4;
        System.out.print(id);
        return 9;
    }

    public static int getStudentCount() {
        return 6;
    }
}
