import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testToString() {
        Review redRobin = new Review("good", "Zahra", 3);
        String message = "Zahragood3";
        assertEquals(message, redRobin.toString());
    }
}