import JLGExample.CountConsonants;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountConsonantsTest {

    @Test
    public void testCountConsonantsWithEmptyString() {
        CountConsonants counter = new CountConsonants();
        assertEquals(0, counter.countConsonants(""));
    }

    @Test
    public void testCountConsonantsWithNoConsonants() {
        CountConsonants counter = new CountConsonants();
        assertEquals(0, counter.countConsonants("aeiou"));
    }

    @Test
    public void testCountConsonantsWithAllConsonants() {
        CountConsonants counter = new CountConsonants();
        assertEquals(20, counter.countConsonants("qwrtzpsdfghjkl yxcvbnm"));
    }

    @Test
    public void testCountConsonantsWithMixedCase() {
        CountConsonants counter = new CountConsonants();
        assertEquals(20, counter.countConsonants("QwRtZpSdFgHjKl YxCvBnM"));
    }

    @Test
    public void testCountConsonantsWithCustomConsonants() {
        CountConsonants counter = new CountConsonants();
        char[] customConsonants = {'q', 'w', 'r', 't', 'z', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'y', 'x', 'c', 'v', 'b', 'n', 'm', ' '};
        counter.setConsonants(customConsonants);
        assertEquals(22, counter.countConsonants("qwrtzpsdfghjkl yxcvbnm"));
    }

    @Test
    public void testCountConsonantsWithNullString() {
        CountConsonants counter = new CountConsonants();
        assertEquals(0, counter.countConsonants(null));
    }

    @Test
    public void testCountConsonantsWithNullConsonants() {
        CountConsonants counter = new CountConsonants();
        counter.setConsonants(null);
        assertEquals(0, counter.countConsonants("qwrtzpsdfghjkl yxcvbnm"));
    }
}
