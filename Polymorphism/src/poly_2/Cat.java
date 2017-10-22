package poly_2;

public class Cat extends Animal implements HomeAnimal {
    @Override
    public void eat() {
        System.out.println("Cat is eat");
    }

    @Override
    public void run() {
        System.out.println("Cat is run");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void goHome() {
        System.out.println("I'm a Cat, I'm going home");
    }
}

