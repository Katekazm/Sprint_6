package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    private Feline mockFeline;

    @Before
    public void setUp() {
        mockFeline = Mockito.mock(Feline.class);
    }

    @Test
    public void getFoodReturnsMockedFood() throws Exception {
        List<String> expected = List.of("Мясо", "Дичь");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(expected);
        Lion lion = new Lion("Самец", mockFeline);
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void getKittensReturnsMockedNumber() throws Exception {
        Mockito.when(mockFeline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самка", mockFeline);
        assertEquals(2, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void throwsExceptionOnInvalidSex() throws Exception {
        new Lion("Нечто", mockFeline);
    }
}
