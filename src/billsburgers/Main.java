package billsburgers;

public class Main {
    public static void main(String[] args) {
        HealthyBurger burger = new HealthyBurger(new Patty("Vegetarian"), new Tomato(), new Lettuce());
        HealthyBurger burger2 = new HealthyBurger(new Patty("Vegan Patty"), new RoastOnion(), new Lettuce(), new Tomato());
        Hamburger burger3 = new Hamburger(new Bread("Rye Bread"), new Patty("Vegetarian"));
        DeluxeBurger burger4 = new DeluxeBurger(new Patty("Vegan Patty"), new Bread("Rye Bread"));
        HealthyBurger burger5 = new HealthyBurger();
        DeluxeBurger burger6 = new DeluxeBurger();
        HealthyBurger burger7 = new HealthyBurger(new Patty("Vegetarian"), new Carrot(), new RoastOnion(), new Lettuce(), new Tomato(), new Drink());
    }
}