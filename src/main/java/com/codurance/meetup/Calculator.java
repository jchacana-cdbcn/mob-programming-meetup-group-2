package com.codurance.meetup;

public class Calculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.contains(",")){
            String[] arrayNumbers = numbers.split(",");
            return Integer.parseInt(arrayNumbers[0]) + Integer.parseInt(arrayNumbers[1]);
        }

        return Integer.parseInt(numbers);
    }
}
