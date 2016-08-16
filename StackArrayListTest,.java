import junit.framework.TestCase;
import org.junit.Test;
/**
 * @author Gladys De La Roca, Jackeline Hidalgo
 * Clase StackArrayListTest
 * Prueba JUnit 
 * @version 24/07/2016
 */
public class StackArrayListTest extends TestCase {
	
	@Test
	public void TestIsEmpty() {
		StackArrayList s = new StackArrayList();
		s.IsEmpty();
		boolean parametro = false;
		boolean paramreal = s.IsEmpty();
		assertEquals(parametro, paramreal);
		s.IsEmpty();
		boolean parametro1 = true;
		boolean paramreal1 = s.IsEmpty();
		assertEquals(parametro1, paramreal1);
	}
	
	@Test
    public void TestPush() {
		StackArrayList s = new StackArrayList();
        String parametro = "";
        s.Push(parametro);
        // TODO review the generated test code and remove the default call to fail.
        fail("Fallo.");
    }

    /**
     * Test of pop method, of class iPila.
     */
    @Test
    public void TestPop() {
    	StackArrayList s = new StackArrayList();
        String parametro = "";
        Object paramreal = s.Pop();
        assertEquals(parametro, paramreal);
        // TODO review the generated test code and remove the default call to fail.
        fail("Fallo");
    }



}
