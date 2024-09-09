import java.util.Scanner;

public class Task2
{
    public static float division(float a, float b){
        if (b!=0)
        {
            return a/b;
        }
        else
        {
            System.out.println("Деление на 0");
            throw new ArithmeticException();
        }
    }
    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            float a = in.nextInt();
            float b = in.nextInt();
            System.out.println(division(a, b));
        }
    }
}
