package playerTest;

import enemies.Boss;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Weapon;

import java.util.WeakHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BarbarianTest {

    Barbarian barbarian;


    @Before
    public void before(){

        barbarian = new Barbarian("Gary", 2000, Weapon.BUSTER_SWORD);
    }

    @Test
    public void doesAttack(){
        assertEquals(180, barbarian.getDamageDealt());
    }

    @Test
    public void hasName(){
        assertEquals("Gary", barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(2000, barbarian.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertTrue(barbarian.getWeapon() instanceof Weapon);
    }

}
