package e01Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple apple = new Apple("Apple");

    @Test
    void testGetApple() {
        assertEquals("Apple", apple.getApple());

    }
}