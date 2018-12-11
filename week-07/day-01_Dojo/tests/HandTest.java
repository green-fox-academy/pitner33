import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {
    Card c1 = new Card("3", "treff");
    Card c2 = new Card("10", "treff");
    Card c3 = new Card("9", "treff");
    Card c4 = new Card("5", "treff");
    Card c5 = new Card("4", "treff");
    Hand hand = new Hand(Arrays.asList(c1, c2, c3, c4, c5));


    Card c21 = new Card("3", "treff");
    Card c22 = new Card("10", "treff");
    Card c23 = new Card("A", "treff");
    Card c24 = new Card("5", "treff");
    Card c25 = new Card("4", "treff");
    Hand hand2 = new Hand(Arrays.asList(c21, c22, c23, c24, c25));




    @Test
    void testHighestCard() {
        assertEquals("10", hand.highestCard());
    }

    @Test
    void testHighestCard2() {
        assertEquals("A", hand2.highestCard());
    }
}