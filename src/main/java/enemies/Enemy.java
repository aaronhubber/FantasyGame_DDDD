package enemies;

public abstract class Enemy {

    private String name;
    private String type;
    private int health;
    private int attackDamage;

    public Enemy(String name, String type, int health, int attackDamage) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
