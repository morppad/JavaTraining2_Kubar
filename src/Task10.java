import java.util.Scanner;

public class Task10 {
    public static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int element = in.nextInt();
            System.out.println(findElement(array, element));
        }
    }
}
