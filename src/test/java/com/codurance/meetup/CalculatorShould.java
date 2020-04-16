package com.codurance.meetup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorShould {

    @Test
    public void return_zero_when_empty_string() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void return_number_when_pass_a_number() {
        assertEquals(6, Calculator.add("6"));
        assertEquals(4, Calculator.add("4"));
        assertEquals(100, Calculator.add("100"));
    }

    @Test
    public void return_sum_of_three_when_one_and_two() {
        assertEquals(3, Calculator.add("1,2"));
    }
}
