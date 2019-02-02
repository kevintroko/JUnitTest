import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    Duck duck = new Duck("Peter");
    @Test
    void getName() {
        assertEquals("Peter", duck.getName());
    }

    @Test
    void isHunger() {
        assertFalse(duck.isHunger());
    }

    @Test
    void getYearsHumanYears() {
        assertEquals(70, duck.getYearsHumanYears(10));
    }
}