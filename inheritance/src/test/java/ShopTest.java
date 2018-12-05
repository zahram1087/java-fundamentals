import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void TestToString() {
        Shop s = new Shop("Target", "retail store", "$$");
        String expected = "Target retail store $$\n";
        String actual = s.toString();
        assertEquals(expected, actual);
    }
    @Test public void testAddMethod() {
        Shop classUnderTest = new Shop("Target", "retail", "$");
        classUnderTest.numStars=3;

        Review target = new Review("good", "zahra", 5);
        String message = "Target retail $\nReview: 4 zahra good";
        classUnderTest.addReview(target);

        assertEquals(message, classUnderTest.toString());
    }
}