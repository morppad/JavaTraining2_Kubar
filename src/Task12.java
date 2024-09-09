import java.util.Scanner;

public class Task12 {
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a % b == 0;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(isDivisible(a, b));
        }
    }
}
