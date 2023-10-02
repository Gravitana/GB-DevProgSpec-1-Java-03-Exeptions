package ru.gravitana.gb.java.exeptions.lesson03.homework.services;

import ru.gravitana.gb.java.exeptions.lesson03.homework.data.Item;
import ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions.InputDataException;
import ru.gravitana.gb.java.exeptions.lesson03.homework.services.validation.CheckDate;
import ru.gravitana.gb.java.exeptions.lesson03.homework.services.validation.CheckPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    private final List<String> data;
    private Item item;

    public DataParser(ArrayList<String> data) {
        this.data = data;
    }

    public Item getItem() throws InputDataException {
        item = parse();
        checkItemFields();
        return item;
    }

    private void checkItemFields() throws InputDataException {
        if (item.getSurname() == null) {
            throw new InputDataException("Не введена фамилия");
        }
        if (item.getName() == null) {
            throw new InputDataException("Не введено имя");
        }
        if (item.getPhone() == null) {
            throw new InputDataException("Не введён номер телефона");
        }
        if (item.getBirthday() == null) {
            throw new InputDataException("Не введена дата рождения");
        }
        if (item.getGender() == null) {
            throw new InputDataException("Не введён пол");
        }
    }

    private Item parse() throws InputDataException {
        item = new Item();

        int fioIndex = 0;
        for (String s : data) {
            if (s.equalsIgnoreCase("f") || s.equalsIgnoreCase("m")) {
                item.setGender(s);
                continue;
            }
            if (s.contains(".")) {
                if (CheckDate.check(s)) {
                    item.setBirthday(s);
                }
                continue;
            }
            if (s.matches(".*[0-9].*")) {
                s = s.replaceAll("[\\Q+-()\\E]+", "");
                if (CheckPhoneNumber.check(s)) {
                    item.setPhone(s);
                }
                continue;
            }
            if (fioIndex > 2) {
                throw new InputDataException("Лишние элементы Ф.И.О.");
            }
            item.setFio(s, fioIndex++);
        }
        return item;
    }
}
