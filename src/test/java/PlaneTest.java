import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.ISLANDER);

    }


    @Test
    public void planeHasCapacity() {
        assertEquals(9, plane.getCapacity());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(180, plane.getWeight());
    }

}

