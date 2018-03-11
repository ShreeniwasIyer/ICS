import org.junit.*;
import static org.junit.Assert.*;

public class PrimeTester_T {

    @Test
    public void test_primes() {
        // Construct a new object of class PrimeTester before you test it
        PrimeTester pt = new PrimeTester();
        // Prime Numbers
        assertTrue(pt.is_prime(3));
        assertTrue(pt.is_prime(5));
        assertTrue(pt.is_prime(7));
        assertTrue(pt.is_prime(17));

        // Non Prime number
        assertFalse(pt.is_prime(30));
        assertFalse(pt.is_prime(-1));
        assertFalse(pt.is_prime(0));
        assertFalse(pt.is_prime(27));
    }
}
