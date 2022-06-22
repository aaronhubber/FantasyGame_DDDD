package players;

public abstract class Melee extends Player{
    public Melee(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public int meleeStrength(Weapon weapon){
        return weapon.baseDamage * 2;
    }
}
