import java.util.Scanner;

public class Task20 {
    public static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            System.out.println(isEmpty(str));
        }
    }
}
