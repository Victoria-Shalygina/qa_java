package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {


        Mockito.when(feline.getKittens()).thenReturn(1);

        Lion lion = new Lion(feline, "Самец");

        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion(feline, "Самец");

        Assert.assertEquals(3, lion.getFood().size());
    }

    @Test
    public void lionMaleTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionFemaleTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionWrongSexTest() throws Exception {
        new Lion(feline, "неизвестно");
    }
}
