package e07Sharpie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    Sharpie sharpie;

    @BeforeEach
    void create() {
        sharpie = new Sharpie("green", 3f);
    }

    @Test
    void testUse() {
        sharpie.use();
        assertEquals(
                99f, sharpie.inkAmount);
    }
}