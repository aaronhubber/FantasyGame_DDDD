package environment;

import enemies.Boss;
import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Player;
import players.Weapon;

import static org.junit.Assert.*;

public class DDDDLabTest {

    DDDDLab ddddLab;
    Barbarian player1;
    Boss boss1;
    @Before
    public void before(){
        ddddLab = new DDDDLab("DDDD Lab");
        player1 = new Barbarian("Dexter", 2000, Weapon.CLAYMORE);
        boss1 = new Boss("Demogorgon", "Monstrosity", 6000, 50);
        ddddLab.addPlayer(player1);
        ddddLab.addEnemy(boss1);
    }

    @Test
    public void canAddPlayer(){
        assertEquals(1, ddddLab.getNumberOfPlayers());
    }

    @Test
    public void canAddEnemy(){
        assertEquals(1, ddddLab.getNumberOfEnemies());
    }

    @Test
    public void canRemovePlayer(){
        ddddLab.removePlayer(player1);
        assertEquals(0, ddddLab.getNumberOfPlayers());
    }

    @Test
    public void canRemoveEnemy(){
        ddddLab.removeEnemy(boss1);
        assertEquals(0, ddddLab.getNumberOfEnemies());
    }


}