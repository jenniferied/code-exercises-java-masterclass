package encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim","Sword",100);

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.getHitPoints());

        damage = 50;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.getHitPoints());
    }
}