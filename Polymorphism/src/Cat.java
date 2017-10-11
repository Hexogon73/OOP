public class Cat extends Animal {
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
}

