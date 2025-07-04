package swe3050;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Swe3050TestTest {

    Swe3050 converter = new Swe3050();

    @Test
    public void testSimpleNumeral() {
        assertEquals("III should convert to 3", 3, converter.romanToInt("III"));
    }

    @Test
    public void testSubtractiveNotation() {
        assertEquals("IX should convert to 9", 9, converter.romanToInt("IX"));
    }

    @Test
    public void testComplexNumeral() {
        assertEquals("MCMXCIV should convert to 1994", 1994, converter.romanToInt("MCMXCIV"));
    }
}
