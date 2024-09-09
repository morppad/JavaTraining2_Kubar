import java.util.Scanner;

public class Task18 {
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            double number = in.nextDouble();
            System.out.println(squareRoot(number));
        }
    }
}
