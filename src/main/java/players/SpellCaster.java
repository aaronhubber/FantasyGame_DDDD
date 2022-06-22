package players;

import behaviour.IAttack;

public abstract class SpellCaster extends Player {

    private Spell spell;
    private Companion companion;

    public SpellCaster(String name, int health, Weapon weapon, Spell spell, Companion companion) {
        super(name, health, weapon);
        this.spell = spell;
        this.companion = companion;
    }

    public Spell getSpell() {
        return spell;
    }

    public Companion getCompanion() {
        return companion;
    }
}
