package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(new Feline());
        String sound = cat.getSound();

        Assert.assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> food = cat.getFood();

        Assert.assertEquals(3, food.size());
        Assert.assertTrue(food.contains("Животные"));
    }
}
