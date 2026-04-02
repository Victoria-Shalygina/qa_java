package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(new Feline());

        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodContainsMeatTest() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> food = cat.getFood();

        Assert.assertTrue(food.contains("Животные"));
    }

    @Test
    public void getFoodContainsBirdsTest() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> food = cat.getFood();

        Assert.assertTrue(food.contains("Птицы"));
    }

    @Test
    public void getFoodContainsFishTest() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> food = cat.getFood();

        Assert.assertTrue(food.contains("Рыба"));
    }
} // test
