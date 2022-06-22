package players;

import java.util.Arrays;
import java.util.List;

public abstract class Player {

    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getDamageDealt() {
        return this.weapon.baseDamage;
    }

    public void takeDamage(int attackDamage) {
        this.health -= attackDamage;
    }
}
