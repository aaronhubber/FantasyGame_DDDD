package players;

import behaviour.IAttack;

public class BloodMage extends SpellCaster implements IAttack {

    public BloodMage(String name, int health, Weapon weapon, Spell spell, Companion companion) {
        super(name, health, weapon, spell, companion);
    }


    @Override
    public int Attack() {
        return super.getWeapon().baseDamage;
    }
}
