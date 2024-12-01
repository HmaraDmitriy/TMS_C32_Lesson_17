package com.teachmeskills.lesson_17.task_2;

/*Задача 2 (опционально)
Получить день недели по дате*/


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date in YYYY-MM-DD format:");
        String inputDate = scanner.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(inputDate, formatter);

            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("Day of the week: " + dayOfWeek);

        } catch (DateTimeParseException e) {
            System.err.println("Error: Incorrect date format.");
        }
    }
}
