public class Main {
    public static void main(String[] args) {

        Potion healPt = new Potion("Heal Potion", "S", 1000, 2, 60, "heal");
        Potion attackPt = new Potion("Attack Potion", "S", 1000, 6, 15, "attack");
        Sword sword = new Sword("Inferno Blade", "S", 9999, 55);
        Shield shield = new Shield("Guardian Shield", "S", 8999, 60);

        healPt.use();
        attackPt.use();
        sword.use();
        shield.use();
    }
}
