package e08Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal testAnimal = new Animal();

    @Test
    void testEeat() {
        testAnimal.eat();
        assertEquals(49, testAnimal.hunger);
    }

    @Test
    void testDrink() {
        testAnimal.drink();
        assertEquals(49, testAnimal.thirst);
    }

    @Test
    void testPlay() {
        testAnimal.play();
        assertEquals(51, testAnimal.hunger);
        assertEquals(51, testAnimal.thirst);
    }
}