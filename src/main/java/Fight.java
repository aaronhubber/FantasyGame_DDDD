import com.sun.media.sound.EmergencySoundbank;
import enemies.Enemy;
import environment.Environment;
import players.Barbarian;
import players.Player;

public class Fight {

    public static void fightEnemy(Player player, Enemy enemy) {
        enemy.takeDamage(player.getDamageDealt());
    }

    public static void fightPlayer(Enemy enemy, Player player) {
        player.takeDamage(enemy.getAttackDamage());
    }

    public static void doBattle(Environment environment){
        while(environment.getNumberOfEnemies() > 0 && environment.getNumberOfPlayers() > 0){
            for(Enemy enemy : environment.getEnemies()){
                for(Player player : environment.getPlayers()){
                    if (enemy.getHealth() > 0 && player.getHealth() > 0){
                        fightEnemy(player, enemy);
                } else if (enemy.getHealth() <= 0) {
                        environment.removeEnemy(enemy);
                    } else if (player.getHealth() <= 0){
                        environment.removePlayer(player);
                    }
                    System.out.println("Christ!");
                }
            }
        }
    }
}
