package players;

import behaviour.IAttack;

public class Templar extends Melee implements IAttack {
    public Templar(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    @Override
    public int Attack() {
        return 0;
    }
}
