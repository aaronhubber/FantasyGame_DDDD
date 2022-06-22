package players;

import behaviour.IAttack;

public class Rogue extends Melee implements IAttack {
    public Rogue(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    @Override
    public int Attack() {
        return 0;
    }
}
