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
    public void return_the_sum_of_given_numbers() {
        assertEquals(3, Calculator.add("1,2"));
        assertEquals(6, Calculator.add("3,3"));
        assertEquals(20, Calculator.add("10,10"));
        assertEquals(45, Calculator.add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    public void return_sum_of_numbers_with_new_line_and_coma_separators() {
        assertEquals(6, Calculator.add("1\n2,3"));
    }
}
