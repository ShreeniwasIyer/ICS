import org.junit.*;
import static org.junit.Assert.*;

public class Converter_T {

    @Test
    public void decimal_to_binary_test() {

        // Assert all possible cases - cases that go into the if as well as outside
        assertEquals("101", Converter.decimal_to_binary(5));
        assertEquals("1101", Converter.decimal_to_binary(13));
    }
}
