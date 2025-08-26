package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.openMocks;

@RunWith(Parameterized.class)
public class LionParamTest {

    @Before
    public void setUp() throws Exception {
        AutoCloseable autoCloseable = openMocks(this);
    }

    private final String sex;
    private final boolean hasMane;

    @Mock
    Feline feline; // = new Feline();

    public LionParamTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] getLionsData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getLionParametersTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualHaveMane = lion.doesHaveMane();

        assertEquals(hasMane, actualHaveMane);
    }
}