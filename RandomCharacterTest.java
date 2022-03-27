import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RandomCharacterTest {
    RandomCharacter randomChar;

    @Before
    public void setUp() {
        randomChar = new RandomCharacter();
        assertTrue(randomChar instanceof RandomCharacter); //check if object instance is of randomcharacter
    }

    @Test
    public void testGetRandomLowerCaseLetter() {
        char output = randomChar.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(output));
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char output = randomChar.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(output));
    }

    @Test
    public void testGetRandomDigitCharacter() {
        char output = randomChar.getRandomDigitCharacter();
        assertTrue(Character.isDigit(output));
    }

    @Test
    public void testGetRandomCharacter() {
        char output = randomChar.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(output));
    }

    @Test
    public void testGetPrime() {
        int output = randomChar.getPrime();
        boolean isPrime = false;
        for (int i = 2; i <= output/2 ; ++i)  {
            if (output % i == 0) {
                isPrime = true;
                break;
            }
        }
        assertTrue(isPrime);
    }
}