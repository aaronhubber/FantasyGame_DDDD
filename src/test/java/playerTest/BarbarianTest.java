package playerTest;

import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;


    @Before
    public void before(){

        barbarian = new Barbarian("Gary", 200, Weapon.BUSTER_SWORD);
    }

    @Test
    public void doesAttack(){
        assertEquals(180, barbarian.Attack());
    }

}
