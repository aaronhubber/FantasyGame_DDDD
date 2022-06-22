import com.sun.corba.se.impl.ior.ObjectAdapterIdArray;
import enemies.Boss;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Weapon;

import static org.junit.Assert.assertEquals;

public class FightTest {

    Boss boss;
    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Gary", 2000, Weapon.BUSTER_SWORD);
        boss = new Boss("GigaChad", "Humunculous", 6000, 50);
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
}
