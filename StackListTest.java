import junit.framework.TestCase;
import org.junit.Test;
/**
 * @author Gladys De La Roca, Jackeline Hidalgo
 * Clase PilaTest
 * Prueba JUnit 
 * @version 24/07/2016
 */
public class StackListTest extends TestCase {
	
	@Test
	public void TestIsEmpty() {
		StackList s = new StackList();
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
		StackList s = new StackList();
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
    	StackList s = new StackList();
        String parametro = "";
        Object paramreal = s.Pop();
        assertEquals(parametro, paramreal);
        // TODO review the generated test code and remove the default call to fail.
        fail("Fallo");
    }



}
