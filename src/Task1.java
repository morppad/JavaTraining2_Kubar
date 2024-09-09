import java.util.Scanner;

public class Task1 {
    public static int max_of_2(int a, int b){
        if (a>b)
        {
            return a;
        }
        if (a<b)
        {
            return b;
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
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(max_of_2(a, b));
        }
    }
}