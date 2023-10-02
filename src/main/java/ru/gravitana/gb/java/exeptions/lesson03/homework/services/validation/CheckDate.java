package ru.gravitana.gb.java.exeptions.lesson03.homework.services.validation;

import ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions.InputDataException;

import java.time.DateTimeException;
import java.time.LocalDate;

import static java.time.LocalDate.now;

public class CheckDate {
    public static boolean check(String str) throws InputDataException {
        String[] dateStr = str.split("\\.");
        LocalDate date;
        try {
            int year = Integer.parseInt(dateStr[2]);
            int month = Integer.parseInt(dateStr[1]);
            int day = Integer.parseInt(dateStr[0]);
            date = LocalDate.of(year, month, day);
            LocalDate now = now();
            int difference = now.getYear() - date.getYear();

            if (difference < 7) {
                throw new InputDataException("Возраст должен быть более 7 лет");
            }
            if (difference > 110) {
                throw new InputDataException("Возраст должен быть менее 110 лет");
            }
        } catch (DateTimeException e) {
            throw new InputDataException("Неправильный формат даты");
        }
        return true;
    }
}
