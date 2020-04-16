package com.codurance.meetup;

import com.sun.deploy.net.MessageHeader;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorShould {

    @Test
    public void return_zero_when_empty_string(){

        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void return_four_when_four_string() {

        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add("4"));
    }

}
