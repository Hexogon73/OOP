package poly_2;

import java.util.ArrayList;

/**
 * Использование интерфейса в качестве полиморфного аргумента
 * (Отправляем домашних животных домой, чтобы их не подстрелил охотник :))
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println("--- poly_2 ---");
        System.out.println("--- Array Polymorphysm ---");
        HomeAnimal[] homeAnimals = new HomeAnimal[2];
        homeAnimals[0] = new Dog(); //homeAnimals homeAnimal = new Dog();
        homeAnimals[1] = new Cat(); //homeAnimals homeAnimal = new Cat();

        for (HomeAnimal a : homeAnimals) { //если животное реализует интерфейс HomeAnimal то мы можем отправить его домой вызвав метод goHome()
            a.goHome();
        }

        System.out.println("--- ArrayList Polymorphysm ---");

        ArrayList<HomeAnimal> homeAnimalsList = new ArrayList<>();
        homeAnimalsList.add(new Dog());
        homeAnimalsList.add(new Cat());

        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Dog());
        animalsList.add(new Cat());

        homeAnimalsList.forEach(HomeAnimal::goHome);

        animalsList.forEach(animal -> {
            animal.run();
            animal.eat();
        });
    }
}
