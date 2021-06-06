package billsburgers;

public class Patty {
    String type;

    public Patty() {
        type = "Vegetarian";
    }

    public Patty(String type) {
        if(type.equals("Vegan Patty") || type.equals("Vegetarian")) {
            this.type = type;
        } else {
            System.out.println("Non viable choice of patty. The standard Vegan Patty has been chosen.");
            this.type = "Vegan Patty";
        }
    }
}