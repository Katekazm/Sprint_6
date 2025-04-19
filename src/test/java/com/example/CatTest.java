package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    private Predator mockFeline;
    private Cat cat;

    @Before
    public void setUp() {
        mockFeline = Mockito.mock(Feline.class);
        cat = new Cat((Feline) mockFeline);
    }

    @Test
    public void getSoundReturnsMeow() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsMockedFood() throws Exception {
        List<String> expected = List.of("Рыба", "Птицы");
        Mockito.when(mockFeline.eatMeat()).thenReturn(expected);
        assertEquals(expected, cat.getFood());
    }
}

