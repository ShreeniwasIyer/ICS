import org.junit.*;
import static org.junit.Assert.*;

public class LinearSearch_T {

    @Test
    public void search_test() {
        // Construct a new object of class PrimeTester before you test it
        LinearSearch ls = new LinearSearch();

        int input[] = {1,2,3,4,5};
        assertEquals(4, ls.search(input, 5));

        int input2[] = new int[5];
        input2[0] = 6;
        input2[1] = 7;
        input2[2] = 8;
        input2[3] = 9;
        input2[4] = 10;

        assertEquals(2, ls.search(input2, 8));

        assertEquals(-1, ls.search(input, 10));
        assertEquals(-1, ls.search(input2, 5));
    }
}
