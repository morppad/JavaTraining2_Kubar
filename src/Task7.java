import java.util.ArrayList;
import java.util.Scanner;

public class Task7
{
    public static void zero_check(ArrayList<Integer> array)
    {
        int count = 0;
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i) == 0)
            {
                count++;
            }
        }
        if (count !=0)
        {
            throw new RuntimeException();
        }
        else
        {System.out.println("В массиве нет нулей");}
    }

    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(size);
            for (int i = 0; i<size; i++)
            {
                int n = in.nextInt();
                array.add(n);
            }
            zero_check(array);
        }
    }
}
