import CodeFacts.CountVowels;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsTest {

    @Test
    public void testCountVowels() {
        CountVowels counter = new CountVowels();

        // Test with a string containing vowels
        String input1 = "Hello World";
        int result1 = counter.countVowels(input1);
        assertEquals(3, result1);

        // Test with a string without vowels
        String input2 = "Hypothetically";
        int result2 = counter.countVowels(input2);
        assertEquals(4, result2);

        // Test with an empty string
        String input3 = "";
        int result3 = counter.countVowels(input3);
        assertEquals(0, result3);

        // Test with custom vowels
        char[] customVowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        counter.setVowels(customVowels);
        String input4 = "Custom Vowels Test";
        int result4 = counter.countVowels(input4);
        assertEquals(5, result4);
    }
}