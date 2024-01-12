import CodeFacts.CountConsonants;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountConsonantsTest {

    @Test
    public void testCountConsonants() {
        CountConsonants counter = new CountConsonants();

        // Test with a string that contains consonants
        assertEquals(7, counter.countConsonants("HelloWorld"));

        // Test with an empty string
        assertEquals(0, counter.countConsonants(""));

        // Test with a string that doesn't contain consonants
        assertEquals(0, counter.countConsonants("12345"));

        // Test with a string that contains only consonants
        assertEquals(7, counter.countConsonants("BCDFGHJ"));

        // Test with a string that contains both consonants and other characters
        assertEquals(7, counter.countConsonants("aBcDeFgHiJ"));

        // Test with a string that contains special characters and spaces
        assertEquals(0, counter.countConsonants("!@#$%^"));
    }

    @Test
    public void testSetAndGetConsonants() {
        CountConsonants counter = new CountConsonants();

        // Test setting and getting consonants
        char[] customConsonants = {'a', 'e', 'i', 'o', 'u'};
        counter.setConsonants(customConsonants);
        assertEquals(customConsonants, counter.getConsonants());
    }
}