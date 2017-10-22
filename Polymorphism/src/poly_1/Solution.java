package poly_1;

import java.util.ArrayList;

/**
 * Использование суперкласса Animal в качестве полиморфного аргумента в массиве и списке
 * (+ Объект охотник пытается подстрелить животных :))
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println("--- poly_1 ---");
        System.out.println("--- Array Polymorphysm ---");
        Animal[] animals = new Animal[3];
        animals[0] = new Dog(); //Animal animal = new Dog();
        animals[1] = new Cat(); //Animal animal = new Cat();
        animals[2] = new Wolf(); //Animal animal = new Wolf();

        for (Animal a : animals) {
            a.eat();
            a.run();
        }

        System.out.println("--- ArrayList Polymorphysm ---");

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Wolf());

        animalList.forEach(animal -> {
            animal.eat();
            animal.run();
        });

        /*
        * 0 -> Dog.eat(); Dog.run()
        * 1 -> Cat.eat(); Cat.run()
        * 2 -> Wolf.eat(); Wolf.run();
        * */


        System.out.println("--- Polymorphysm ---");

        Hunter hunter = new Hunter();
        animalList.forEach(hunter::giveShot);
        /*
        * 0 -> Hunter.giveShot(){Dog.makeNoise()}
        * 1 -> Hunter.giveShot(){Cat.makeNoise()}
        * 2 -> Hunter.giveShot(){Wolf.makeNoise()}
        * */
    }
}
