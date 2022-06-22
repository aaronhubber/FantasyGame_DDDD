package enemyTests;

import enemies.Boss;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BossTest {

    Boss boss;

    @Before
    public void before(){
        boss = new Boss("GigaChad", "Humunculous", 6000, 50);
    }

    @Test
    public void hasName(){
        assertEquals("GigaChad", boss.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Humunculous", boss.getType());
    }

    @Test
    public void hasHealth(){
        assertEquals(6000, boss.getHealth());
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(50, boss.getAttackDamage());
    }

    @Test
    public void canTakeDamage(){
        boss.takeDamage(50);
        assertEquals(5950, boss.getHealth());
    }
}
