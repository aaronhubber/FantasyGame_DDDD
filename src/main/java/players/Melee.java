package players;

import behaviour.IAttack;

public abstract class Melee extends Player {
    public Melee(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public int getDamageDealt(){
        return super.getWeapon().baseDamage * 2;
    }


}
