package ru.gravitana.gb.java.exeptions.lesson03.homework.services;

import ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions.InputDataException;

public class CheckPhoneNumber {
    public static boolean check(String str) throws InputDataException {
        str = str.replace("+", "").replace("-", "");
        if (str.length() != 11) {
            throw new InputDataException("Неправильный формат телефона");
        }
        return true;
    }
}
