package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    private AlexLion alexLion;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        alexLion = new AlexLion(feline);
    }

    @Test
    public void doesHaveManeTest() {
      boolean actualHaveMane = alexLion.doesHaveMane();
      boolean expectedHaveMane = true;

      assertEquals(expectedHaveMane, actualHaveMane);
    }

    @Test
    public void getFriendsTest() throws Exception {
        List<String> actualFriends = alexLion.getFriends();
        List<String> expectedFriends = Arrays.asList("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");

        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void getFoodTest() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualAlexFood = alexLion.getFood();
        List<String> expectedLionFood = Arrays.asList("Животные", "Птицы", "Рыба");

        assertEquals(expectedLionFood, actualAlexFood);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String actualPlaceOfLiving = alexLion.getPlaceOfLiving();
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";

        assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void getKittens() {
        int actualKittens = alexLion.getKittens();
        int expectedKittens = 0;

        assertEquals(expectedKittens, actualKittens);
    }
}