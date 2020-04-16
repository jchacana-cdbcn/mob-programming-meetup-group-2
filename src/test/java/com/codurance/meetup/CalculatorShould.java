package com.codurance.meetup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorShould {

    @Test
    public void return_zero_when_empty_string() {

        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void return_number_when_pass_a_number() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add("6"));
        assertEquals(4, calculator.add("4"));
        assertEquals(100, calculator.add("100"));
    }
}
