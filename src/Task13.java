import java.util.Scanner;

public class Task13 {
    public static int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int index = in.nextInt();
            System.out.println(getElement(array, index));
        }
    }
}
