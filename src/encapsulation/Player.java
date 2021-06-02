package encapsulation;

public class Player {
    private String name, weapon;
    private int hitPoints = 100;

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if(this.hitPoints <= 0) {
            System.out.println("Wasted");
            // Reduce number of lives remaining for the player
        }
    }

    public Player(String name, String weapon, int health) {

        this.name = name;
        this.weapon = weapon;
        if(health > 0 && health <= 200) {
            this.hitPoints = health;
        }
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}