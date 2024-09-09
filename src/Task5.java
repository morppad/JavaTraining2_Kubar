import java.util.Scanner;
public class Task5 {
    public static double age_check(int a){

        if (a > 0)
        {
            return Math.sqrt(a);
        }
        else { throw new IllegalArgumentException(); }
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
