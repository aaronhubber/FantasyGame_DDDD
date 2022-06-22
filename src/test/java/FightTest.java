import com.sun.corba.se.impl.ior.ObjectAdapterIdArray;
import enemies.Boss;
import environment.DDDDLab;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Weapon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FightTest {

    Boss boss;
    Barbarian barbarian;

    DDDDLab ddddLab;
    Barbarian player1;
    Boss boss1;
    @Before
    public void before(){
        barbarian = new Barbarian("Gary", 2000, Weapon.BUSTER_SWORD);
        boss = new Boss("GigaChad", "Humunculous", 6000, 50);
        ddddLab = new DDDDLab("DDDD Lab");
        player1 = new Barbarian("Dexter", 2000, Weapon.CLAYMORE);
        boss1 = new Boss("Demogorgon", "Monstrosity", 1, 50);
        ddddLab.addPlayer(player1);
        ddddLab.addEnemy(boss1);
    }



    @Test
    public void canAttackBoss(){
        Fight.fightEnemy(barbarian, boss);
        assertEquals(5820, boss.getHealth());
    }

    @Test
    public void canBeAttackedByBoss(){
        Fight.fightPlayer(boss, barbarian);
        assertEquals(1950, barbarian.getHealth());
    }

    @Test
    public void howMuchCanJavaTake(){
        Fight.doBattle(ddddLab);
        assertEquals(0, ddddLab.getNumberOfEnemies());
    }

}
