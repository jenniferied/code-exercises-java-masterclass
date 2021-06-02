package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 2, 4, 2, 4, 1, 20,"silky");
        dog.eat();
        dog.move(0);
        dog.walk();
        dog.run();
    }
