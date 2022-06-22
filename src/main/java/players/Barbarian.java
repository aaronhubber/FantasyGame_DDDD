package players;

public class Barbarian extends Melee {
    public Barbarian(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }


    @Override
    public int Attack() {
        return meleeStrength(super.getWeapon());
    }
}

