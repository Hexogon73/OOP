import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println("--- Array Polymorphysm ---");
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();

        for (Animal a : animals) {
            a.eat();
            a.run();
        }

        System.out.println("--- ArrayList Polymorphysm ---");

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Wolf());

        animalList.forEach(animal -> {animal.eat(); animal.run();});
    }
}
