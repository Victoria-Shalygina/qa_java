package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatContainsAnimalsTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        Assert.assertTrue(food.contains("Животные"));
    }

    @Test
    public void eatMeatContainsBirdsTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        Assert.assertTrue(food.contains("Птицы"));
    }

    @Test
    public void eatMeatContainsFishTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        Assert.assertTrue(food.contains("Рыба"));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();

        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultTest() {
        Feline feline = new Feline();

        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamTest() {
        Feline feline = new Feline();

        Assert.assertEquals(5, feline.getKittens(5));
    }
}
