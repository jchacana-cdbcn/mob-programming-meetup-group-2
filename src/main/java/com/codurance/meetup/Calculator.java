package com.codurance.meetup;

public class Calculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        return Integer.parseInt(numbers);

    }
}
