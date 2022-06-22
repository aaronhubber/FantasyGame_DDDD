import com.sun.media.sound.EmergencySoundbank;
import enemies.Enemy;
import players.Barbarian;
import players.Player;

public class Fight {

//    fightEnemy(Player, Enemy) -- Player.getDamageDealt(), setEnemyHealth(currentHealth-damageDealt)

//    fightPlayer(Enemy, Player) --

    public static void fightEnemy(Player player, Enemy enemy) {
        enemy.takeDamage(player.getDamageDealt());
    }

    public static void fightPlayer(Enemy enemy, Player player) {
        player.takeDamage(enemy.getAttackDamage());
    }
}
