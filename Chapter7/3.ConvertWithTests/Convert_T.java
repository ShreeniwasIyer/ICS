import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;

public class Convert_T {

    @Test
    public void fahrenheitTest() {
        // assert statements
        assertEquals("78F must be equal to 25.55", 25.55, Convert.fahrenheitToCelsius(78.0), 0.01);
    }
}
