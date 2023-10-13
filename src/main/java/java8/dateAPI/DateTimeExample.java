package java8.dateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

    public static void main(String[] args) {

        // Get the current date and time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);

        // Formatting date and time
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("\nFormatted Date: " + currentDate.format(dateFormatter));
        System.out.println("Formatted Time: " + currentTime.format(timeFormatter));
        System.out.println("Formatted Date and Time: " + currentDateTime.format(dateTimeFormatter));

        // Adding and subtracting time
        LocalDate futureDate = currentDate.plus(1, ChronoUnit.WEEKS);
        LocalDate pastDate = currentDate.minus(2, ChronoUnit.MONTHS);

        System.out.println("\nOne week from now: " + futureDate);
        System.out.println("Two months ago: " + pastDate);

        // Parsing date and time
        LocalDate parsedDate = LocalDate.parse("23-10-2023", dateFormatter);
        System.out.println("\nParsed Date: " + parsedDate);
    }
}
