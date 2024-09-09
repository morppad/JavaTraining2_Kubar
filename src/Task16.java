import java.util.Scanner;

public class Task16 {
    public static String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException();
        }
        return str1 + str2;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(concatenate(str1, str2));
        }
    }
}
