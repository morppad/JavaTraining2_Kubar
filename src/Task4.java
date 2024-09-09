import java.util.Scanner;

public class Task4 {
    public static int age_check(int a){
        if (a <= 0 || a > 150)
        {
            throw new IllegalArgumentException();
        }
        else { return a; }
    }
    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            System.out.println(age_check(a));
        }
    }
}
