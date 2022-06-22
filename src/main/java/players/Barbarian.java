package players;

import behaviour.IAttack;
import behaviour.ITakeDamage;
import enemies.Enemy;

public class Barbarian extends Melee {
    public Barbarian(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public void takeDamage(int damage) {
        int newHealth = super.getHealth() - damage;
        super.setHealth(newHealth);
    }

//    public void newAttack(Enemy enemy){
//        if (enemy.getHealth() > Attack()) {
//            int newhp = enemy.getHealth() - Attack();
//            enemy.setHealth(newhp);
//        } else if (enemy.getHealth() < Attack()) {
//            // TODO: remove enemy from list of enemies in dungeon
//        } else {
//            // TODO: if Room.enemyList.size() == 0 move to next room
//        }
//    }

//    @Override
//    public void takeDamage(IAttack personTakingDamage) {
//        if (super.getHealth() > 0) {
//        int newHealth = getHealth() - personTakingDamage.getWeapon();
//        super.setHealth();
//    }
}

