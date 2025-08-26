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
public class LionTest {

    private Lion lion;

    @Mock
    private Feline feline;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самка", feline);
    }

    @Test
    public void getKittensTest() {
        when(feline.getKittens()).thenReturn(1);
        int actualKittens = lion.getKittens();
        int expectedKittens = 1;

        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getFoodTest() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood  = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void catchSexExceptionTest() {
        String expectedSexExceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () -> new Lion("Пол указан невалидно", feline));

        assertEquals("Обработано исключение, недопустимое значение пола", expectedSexExceptionMessage, exception.getMessage());
    }
}