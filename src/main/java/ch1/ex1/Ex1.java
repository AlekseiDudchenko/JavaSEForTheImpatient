package ch1.ex1;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Change the calendar printing program so it starts the week on a Sunday.
 * Also make it print a newline at the end (but only one).
 */

public class Ex1 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now().withDayOfMonth(1);
        int month = currentDate.getMonthValue();

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < getDayOfWeekNewValue(currentDate.getDayOfWeek()) - 1; i++)
            System.out.print("    ");

        while (currentDate.getMonthValue() == month) {
            System.out.printf("%4d", currentDate.getDayOfMonth());
            currentDate = currentDate.plusDays(1);

            if (getDayOfWeekNewValue(currentDate.getDayOfWeek()) == 1)
                System.out.println();
        }
    }

    private static int getDayOfWeekNewValue(DayOfWeek day) {
        return (day.getValue() % 7) + 1;
    }
}