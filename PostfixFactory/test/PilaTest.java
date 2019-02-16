import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {        
        System.out.println("Prueba con vector");
        Pila instance = new Pila();
        instance.push(1);
        instance.push(2);
        instance.push(6);
        instance.push(24);
        int result = 24;
        int prueba = Integer.parseInt(instance.pop().toString());
        assertEquals(prueba, result);
    }

    /**
     * Test of peek method, of class Pila.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Pila instance = new Pila();
        instance.push(5);
        int expResult = 5;
        int result = Integer.parseInt(instance.pop().toString());
        assertEquals(expResult, result);
    }

    /**
     * Test of empty method, of class Pila.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        Pila instance = new Pila();
        instance.push(1);
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Pila.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Pila instance = new Pila();
        instance.push(1);
        instance.push(2);
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
    }
}
