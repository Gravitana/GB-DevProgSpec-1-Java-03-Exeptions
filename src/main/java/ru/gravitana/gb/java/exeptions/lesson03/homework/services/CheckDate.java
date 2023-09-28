package ru.gravitana.gb.java.exeptions.lesson03.homework.services;

import ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions.InputDataException;

import java.time.DateTimeException;
import java.time.LocalDate;

public class CheckDate {
    public static boolean check(String str) throws InputDataException {
        String[] date = str.split("\\.");
        try {
            int year = Integer.parseInt(date[2]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[0]);
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw new InputDataException("Неправильный формат даты");
        }
        return true;
    }
}
