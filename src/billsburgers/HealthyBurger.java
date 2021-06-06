package billsburgers;

public class HealthyBurger extends Hamburger{
    public Extra extra1, extra2, extra3, extra4, extra5;

    public HealthyBurger() {
        this(new Patty(), new Extra(), new Extra(), new Extra(), new Extra(), new Extra());
    }

    public HealthyBurger(Patty patty) {
        this(patty, new Extra(), new Extra(), new Extra(), new Extra(), new Extra());
    }

    public HealthyBurger(Patty patty, Extra extra1) {
        this(patty, extra1, new Extra(), new Extra(), new Extra(), new Extra());
    }
    public HealthyBurger(Patty patty, Extra extra1, Extra extra2) {
        this(patty, extra1, extra2, new Extra(), new Extra(), new Extra());
    }

    public HealthyBurger(Patty patty, Extra extra1, Extra extra2, Extra extra3) {
        this(patty, extra1, extra2, extra3, new Extra(), new Extra());
    }

    public HealthyBurger(Patty patty, Extra extra1, Extra extra2, Extra extra3, Extra extra4) {
        this(patty, extra1, extra2, extra3, extra4, new Extra());
    }

    public HealthyBurger(Patty patty, Extra extra1, Extra extra2, Extra extra3, Extra extra4, Extra extra5) {
        super(new Bread("Rye Bread"), patty);
        this.name = "Healthy Burger";
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
        this.extra4 = extra4;
        this.extra5 = extra5;
        price += extra1.additionalPrice + extra2.additionalPrice + extra3.additionalPrice + extra4.additionalPrice + extra5.additionalPrice;
        printDetails();
    }

    public void printDetails() {
        printBurgerDetails();
        printExtraDetails();
        System.out.println(" ");
    }

    private void printExtraDetails() {
        System.out.println("Extras: " + this.extra1.name + " - " + this.extra2.name + " - " + this.extra3.name + " - " + this.extra4.name + " - " + this.extra5.name);
    }

}