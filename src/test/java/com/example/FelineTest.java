package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        Assert.assertEquals(3, food.size());
        Assert.assertTrue(food.contains("Животные"));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String family = feline.getFamily();

        Assert.assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensDefaultTest() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();

        Assert.assertEquals(1, kittens);
    }

    @Test
    public void getKittensWithParamTest() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(5);

        Assert.assertEquals(5, kittens);
    }
}
