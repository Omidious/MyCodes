import JLGExample.CountVowels;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsTest {

    @Test
    public void testCountVowelsWithEmptyString() {
        CountVowels counter = new CountVowels();
        assertEquals(0, counter.countVowels(""));
    }

    @Test
    public void testCountVowelsWithNoVowels() {
        CountVowels counter = new CountVowels();
        assertEquals(0, counter.countVowels("xyz"));
    }

    @Test
    public void testCountVowelsWithAllVowels() {
        CountVowels counter = new CountVowels();
        assertEquals(5, counter.countVowels("aeiou"));
    }

    @Test
    public void testCountVowelsWithMixedCase() {
        CountVowels counter = new CountVowels();
        assertEquals(5, counter.countVowels("aEiOu"));
    }

    @Test
    public void testCountVowelsWithCustomVowels() {
        CountVowels counter = new CountVowels();
        char[] customVowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        counter.setVowels(customVowels);
        assertEquals(6, counter.countVowels("aeiouy"));
    }

    @Test
    public void testCountVowelsWithNullString() {
        CountVowels counter = new CountVowels();
        assertEquals(0, counter.countVowels(null));
    }

    @Test
    public void testCountVowelsWithNullVowels() {
        CountVowels counter = new CountVowels();
        counter.setVowels(null);
        assertEquals(0, counter.countVowels("aeiou"));
    }
}
