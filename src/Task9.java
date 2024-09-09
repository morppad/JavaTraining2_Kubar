import java.util.Scanner;

public class Task9 {
    public static String truncateString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException();
        } else {
            return str.substring(0, length);
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            int length = in.nextInt();
            System.out.println(truncateString(str, length));
        }
    }
}
