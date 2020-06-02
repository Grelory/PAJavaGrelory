package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Human());
        animals.add(new Lion());
        animals.add(new Raven());
        animals.add(new Piranha());
        animals.add(new Lion());
        animals.add(new Raven());
        animals.add(new Human());

        for (Animal animal : animals) {
            System.out.println(animal.breathe());
            System.out.println(animal.move());
        }
    }
}
