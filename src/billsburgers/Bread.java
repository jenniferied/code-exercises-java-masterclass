package billsburgers;

public class Bread {
    String type;

    public Bread() {
        type = "Sesame Bun";
    }

    public Bread(String type) {
        if(type.equals("Sesame Bun") || type.equals("Rye Bread")) {
            this.type = type;
        } else {
            System.out.println("Non viable choice of bread bun. The standard Sesame Bun has been chosen.");
            this.type = "Sesame Bun";
        }
    }
}