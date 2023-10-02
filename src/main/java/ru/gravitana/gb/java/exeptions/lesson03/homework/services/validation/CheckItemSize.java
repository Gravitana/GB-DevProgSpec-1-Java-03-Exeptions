package ru.gravitana.gb.java.exeptions.lesson03.homework.services.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckItemSize {
    static final int REQUIRED_ELEMENTS = 6;

    public static int check(ArrayList<String> data) {
        return Integer.compare(data.size(), REQUIRED_ELEMENTS);
    }
}
