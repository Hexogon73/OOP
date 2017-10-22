package poly_1;

public class Dog extends Animal {
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
}
