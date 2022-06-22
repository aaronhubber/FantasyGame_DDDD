package playerTest;

import org.junit.Before;
import org.junit.Test;
import players.BloodMage;
import players.Companion;
import players.Spell;
import players.Weapon;

import static org.junit.Assert.*;

public class BloodMageTest {

    BloodMage bloodMage;
    Companion apatheticImp;

    @Before
    public void before(){
        apatheticImp = new Companion("Gus", "Imp", 3);
        bloodMage = new BloodMage("Zoey", 1000, Weapon.FLOPPY_WAND, Spell.SPLOOT, apatheticImp);
    }

    @Test
    public void hasName(){
        assertEquals("Zoey", bloodMage.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(1000, bloodMage.getHealth());
    }
    @Test
    public void hasWeapon(){
        assertTrue(bloodMage.getWeapon() instanceof Weapon);
    }

    @Test
    public void hasSpell(){
        assertTrue(bloodMage.getSpell() instanceof Spell);
    }

    @Test
    public void hasCompanion(){
        assertTrue(bloodMage.getCompanion() instanceof Companion);
    }

    @Test
    public void canAttack(){
        assertEquals(2, bloodMage.Attack());
    }

}