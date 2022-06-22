package players;

import behaviour.IAttack;

public abstract class Melee extends Player implements IAttack {
    public Melee(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public int meleeStrength(Weapon weapon){
        return weapon.baseDamage * 2;
    }


}
