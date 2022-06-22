package players;

public enum Spell {

    LIGHTNING(40),
    FLARE(60),
    SPLOOT(20),
    SACRIFICE(90),
    HOLY_ORDER(65),
    DOOM(90);

    public final int baseDamage;

    Spell(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
