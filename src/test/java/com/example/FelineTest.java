package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class FelineTest {

    Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualMeat = feline.eatMeat();

        assertEquals(expectedMeat, actualMeat);
    }

    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();

        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensTest() {
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();

        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getKittensWithParameterTest() {
        int expectedKittens = 2;
        int actualKittens = feline.getKittens(2);

        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood  = feline.getFood("Хищник");

        assertEquals(expectedFood, actualFood);
    }
}