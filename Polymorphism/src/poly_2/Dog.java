package poly_2;

public class Dog extends Animal implements HomeAnimal {
    @Override
    public void eat() {
        System.out.println("Dog is eat");
    }

    @Override
    public void run() {
        System.out.println("Dog is run");
    }

    @Override
    public void makeNoise() {
        System.out.println("Wow wow!");
    }

    @Override
    public void goHome() {
        System.out.println("I'm a Dog, I'm going home");
    }
}
