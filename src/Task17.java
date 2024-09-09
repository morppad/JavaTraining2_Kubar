import java.util.Scanner;

public class Task17 {
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a % b;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(remainder(a, b));
        }
    }
}
