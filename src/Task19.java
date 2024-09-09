import java.util.Scanner;

public class Task19 {
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException();
        }
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            double celsius = in.nextDouble();
            System.out.println(celsiusToFahrenheit(celsius));
        }
    }
}
