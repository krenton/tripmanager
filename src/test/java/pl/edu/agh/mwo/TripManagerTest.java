package pl.edu.agh.mwo;
 
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TripManagerTest {

    @Test
    public void testDummy(){
        TripManager b = new TripManager();
        assertEquals(5, b.dummy());
    }

}
