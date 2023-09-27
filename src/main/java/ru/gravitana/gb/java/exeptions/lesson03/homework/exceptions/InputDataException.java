package ru.gravitana.gb.java.exeptions.lesson03.homework.exceptions;

import java.io.IOException;

public class InputDataException extends IOException {
    public InputDataException(String message) {
        super(message);
    }
}
