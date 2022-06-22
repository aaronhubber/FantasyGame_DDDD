package players;

public abstract class SpellCaster extends Player {

    private Spell spell;

    public SpellCaster(String name, int health, Weapon weapon, Spell spell) {
        super(name, health, weapon);
        this.spell = spell;
    }
}
