package com.codurance.meetup;

import java.util.Arrays;

public class Calculator {

    private Calculator() {

    }

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.contains(",")){
            String[] arrayNumbers = numbers.split(",");
            return Arrays.stream(arrayNumbers)
                    .mapToInt(Integer::parseInt)
                    .sum();
        }

        return Integer.parseInt(numbers);
    }
}
