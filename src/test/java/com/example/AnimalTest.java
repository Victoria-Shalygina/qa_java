package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

    @Test
    public void testHerbivoreFoodContainsGrass() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Травоядное");

        Assert.assertTrue(food.contains("Трава"));
    }

    @Test
    public void testHerbivoreFoodContainsPlants() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Травоядное");

        Assert.assertTrue(food.contains("Различные растения"));
    }

    @Test
    public void testPredatorFoodContainsAnimals() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Хищник");

        Assert.assertTrue(food.contains("Животные"));
    }

    @Test
    public void testPredatorFoodContainsBirds() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Хищник");

        Assert.assertTrue(food.contains("Птицы"));
    }

    @Test
    public void testPredatorFoodContainsFish() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Хищник");

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
