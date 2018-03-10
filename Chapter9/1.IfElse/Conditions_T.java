import org.junit.*;
import static org.junit.Assert.*;

public class Conditions_T {

    @Test
    public void next_month_test() {
        // Construct a new object of class Conditions before you test it
        Conditions c = new Conditions();
        // Assert all possible cases - cases that go into the if as well as outside
        assertEquals(2, c.next_month(1));
        assertEquals(12, c.next_month(11));
        assertEquals(1, c.next_month(12));
        assertEquals(1, c.next_month(78));
        assertEquals(1, c.next_month(-1));
    }

    @Test
    public void type_of_number_tertiary_test() {
        // Construct a new object of class Conditions before you test it
        Conditions c = new Conditions();
        // Assert all possible cases - cases that go into the if as well as outside
        assertEquals("Positive", c.type_of_number_tertiary(78));
        assertEquals("Zero", c.type_of_number_tertiary(0));
        assertEquals("Negative", c.type_of_number_tertiary(-23));
    }

    @Test
    public void get_currency_prefix_test() {
        // Construct a new object of class Conditions before you test it
        Conditions c = new Conditions();
        // Assert all possible cases - cases that go into the if as well as outside
        assertEquals('$', c.get_currency_prefix("SGD"));
        assertEquals('$', c.get_currency_prefix("HKD"));
        assertEquals('$', c.get_currency_prefix("USD"));
        assertEquals('€', c.get_currency_prefix("EUR"));
        assertEquals('¥', c.get_currency_prefix("JPY"));
        assertEquals('-', c.get_currency_prefix("INR"));

    }


}
