package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

    @Test
    public void testHerbivoreFood() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Травоядное");

        Assert.assertTrue(food.contains("Трава"));
        Assert.assertTrue(food.contains("Различные растения"));
    }

    @Test
    public void testPredatorFood() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Хищник");

        Assert.assertTrue(food.contains("Животные"));
        Assert.assertTrue(food.contains("Птицы"));
        Assert.assertTrue(food.contains("Рыба"));
    }

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("неизвестно");
    }

    @Test
    public void testFamily() {
        Animal animal = new Animal();
        Assert.assertTrue(animal.getFamily().contains("кошачьи"));
    }
}
