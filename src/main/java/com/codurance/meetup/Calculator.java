package com.codurance.meetup;

import java.util.Arrays;

public class Calculator {

    public static final String SEPARATORS = ",|\n";

    private Calculator() {

    }

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] arrayNumbers = numbers.split(SEPARATORS);
        return Arrays.stream(arrayNumbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
