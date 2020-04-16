package com.codurance.meetup;

import java.util.Arrays;

public class Calculator {

    private Calculator() {

    }

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] arrayNumbers = numbers.split(",");
        return Arrays.stream(arrayNumbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
