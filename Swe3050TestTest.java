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
    @Test
public void testSingleNumeral() {
    assertEquals("V should convert to 5", 5, converter.romanToInt("V"));
}

@Test
public void testLongestSimpleNumeral() {
    assertEquals("MMM should convert to 3000", 3000, converter.romanToInt("MMM"));
}

@Test
public void testSubtractiveWithC() {
    assertEquals("XLIV should convert to 44", 44, converter.romanToInt("XLIV"));
}

@Test
public void testAnotherSubtractive() {
    assertEquals("XCIX should convert to 99", 99, converter.romanToInt("XCIX"));
}

@Test
public void testWithLargerNumerals() {
    assertEquals("CDXLIV should convert to 444", 444, converter.romanToInt("CDXLIV"));
}

@Test
public void testMaximumRomanNumeral() {
    assertEquals("MMMCMXCIX should convert to 3999", 3999, converter.romanToInt("MMMCMXCIX"));
}

}

