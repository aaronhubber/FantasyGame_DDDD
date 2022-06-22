package players;

public enum Weapon {

    CLAYMORE (70),
    BUSTER_SWORD(90),
    SOUL_KNIFE(34),
    CROSSBOW(50),
    ELEMENTAL_STAFF(10),
    WAR_HAMMER(80),
    FLOPPY_WAND(2),
    DAGGER(25),
    BATTLE_AXE(40);


    public final int baseDamage;


    Weapon(int baseDamage) {
        this.baseDamage = baseDamage;
    }


}

