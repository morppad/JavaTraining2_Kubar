import java.util.Scanner;

public class Task11 {
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            System.out.println(toBinary(number));
        }
    }
}
