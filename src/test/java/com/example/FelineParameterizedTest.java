package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int input;
    private final int expected;

    public FelineParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][] {
                {0, 0},
                {1, 1},
                {5, 5}
        });
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(input));
    }
}

