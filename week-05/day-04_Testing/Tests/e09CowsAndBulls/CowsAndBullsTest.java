package e09CowsAndBulls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CowsAndBullsTest {

    @Test
    void testCowsAndBullsRandomIsBetween1000And9999() {
        CowsAndBulls newcow = new CowsAndBulls();
        assertEquals(4, Integer.toString(newcow.getRandomNumber()).length());
    }

    @Test
    void numberToString() {
    }

    @Test
    void guessing() {
    }

    @Test
    void newGuess() {
    }
}