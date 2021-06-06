package billsburgers;

public class DeluxeBurger extends Hamburger{
    public Extra extra1, extra2;

    public DeluxeBurger() {
        this(new Patty(), new Bread());
    }

    public DeluxeBurger(Patty patty, Bread bread) {
        super(new Bread("Rye Bread"), patty);
        this.name = "Deluxe Burger";
        this.price = 9.2;
        this.extra1 = new Drink();
        this.extra2 = new Fries();
        printDetails();
    }

    public void printDetails() {
        printBurgerDetails();
        printExtraDetails();
        System.out.println(" ");
    }

    private void printExtraDetails() {
        System.out.println("Extras: " + this.extra1.name + " - " + this.extra2.name);
    }

}