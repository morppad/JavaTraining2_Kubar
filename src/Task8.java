import java.util.Scanner;

public class Task8
{
    public static double factorial(double N, double P)
    {
        if (P >= 0)
        {
            return Math.pow(N, P);
        }
        else
        {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int P = in.nextInt();
            System.out.println(factorial(N, P));
        }
    }
}
