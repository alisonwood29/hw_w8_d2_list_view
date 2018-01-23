package example.codeclan.com.listviewhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 23/01/2018.
 */

public class ChocolateTest {

    Chocolate chocolate;

    @Before
    public void before(){
        chocolate = new Chocolate();
    }

    @Test
    public void canGetList(){
        assertEquals(5, chocolate.getList().size());
    }
}
