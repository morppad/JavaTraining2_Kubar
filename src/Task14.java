import java.util.Scanner;

public class Task14 {
    public static boolean checkPassword(String password) throws Exception {
        Exception WeakPasswordException = new Exception("Weak password");
        if (password.length() < 8) {
            throw new Exception(WeakPasswordException);
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner in = new Scanner(System.in);
            String password = in.nextLine();
            System.out.println(checkPassword(password));
        }
    }
}
