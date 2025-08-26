package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private Cat cat;

    @Mock
    private Feline feline;

    @Before
    public void setUp() throws Exception {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";

        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}