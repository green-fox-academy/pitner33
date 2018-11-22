package e06Extension;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testAdd_2and6is8() {
        assertEquals(8, extension.add(2, 6));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    void testMaxOfThree_fourth() {
        assertEquals(5, extension.maxOfThree(3, 5, 4));
    }

    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7.0 ,5.0 ,3.0 ,5.0)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)));
    }

    @Test
    void testMedian_six() {
        assertEquals(4, extension.median(Arrays.asList(7.0, 4.0, 8.0, 3.0, 2.0, 1.0, 5.0)));
    }

    @Test
    void testMedian_seven() {
        assertEquals(3.5, extension.median(Arrays.asList(7.0, 4.0, 8.0, 3.0, 2.0, 1.0)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testIsVowel_() {
        assertFalse(extension.isVowel('t'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}