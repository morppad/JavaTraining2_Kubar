import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Task15 {
    public static boolean checkDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Invalid date format", date, 0);
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String date = in.nextLine();
            System.out.println(checkDate(date));
        }
    }
}
