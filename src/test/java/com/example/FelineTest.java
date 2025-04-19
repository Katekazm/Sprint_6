package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnsDefaultValueOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgumentReturnsSameValue() {
        assertEquals(3, feline.getKittens(3));
    }
}
