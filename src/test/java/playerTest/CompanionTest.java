package playerTest;

import org.junit.Before;
import org.junit.Test;
import players.Companion;

import static org.junit.Assert.assertEquals;

public class CompanionTest {

    Companion slime;

    @Before
    public void before(){
        slime = new Companion("Charles Smiles", "Slime", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Charles Smiles", slime.getName());
    }
    @Test
    public void hasType(){
        assertEquals("Slime", slime.getType());
    }
    @Test
    public void hasHealth(){
        assertEquals(100, slime.getHealth());
    }

}
