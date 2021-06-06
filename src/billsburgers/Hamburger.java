package billsburgers;

public class Hamburger {
    String name;
    Bread bread;
    Patty patty;
    double price;

    public Hamburger(Bread bread, Patty patty) {
        this.name = "Hamburger";
        this.bread = bread;
        this.patty = patty;
        this.price = 3.5;
    }

    public void printBurgerDetails() {
        System.out.println("Burger: " + this.name + " - " + this.bread.type + " - " + this.patty.type + " - " + this.price);
    }
}