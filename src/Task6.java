import java.util.Scanner;

public class Task6
{
    public static int factorial(int N) {
        String n = String.valueOf(N);
        char[] array = n.toCharArray();
        int sum = 0;
        int f = 1;
        for (int i = 1; i <= N; i++) {
            f = f * i;
        }
        if (N > 0) {
            return f;
        } else {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            System.out.println(factorial(N));
        }
    }
}
