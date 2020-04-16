package com.codurance.meetup;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorShould {

    @Test
    public void return_zero_when_empty_string(){

        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(""));
    }
}
