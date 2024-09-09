import java.util.Scanner;

public class Task3
{
    public static int age_check(String a){
        try
        {
            int num = Integer.parseInt(a);
            return num;
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            String a = in.nextLine();
            System.out.println(age_check(a));
        }
    }
}
