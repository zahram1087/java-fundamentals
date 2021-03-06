import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testingTheaterConstructor() {
        Theater t = new Theater("south", "sun");
        String message ="Theater: south\nMovies: sun";
        assertEquals(message, t.toString());

    }
    @Test
    public void testingAddMovieMethod() {
        Theater t = new Theater("south", "sun");
        t.addMovie("moon");
        String message ="Theater: south\nMovie: sun\nMovie: moon";
        assertEquals(message, t.toString());
    }

    @Test
    public void testingRemoveMovieMethod() {
        Theater t = new Theater("south", "sun");
        t.addMovie("moon");
        t.addMovie("star");
        t.removeMovie("moon");

        String message ="Theater: south\nMovie: sun\nMovie: star";
        assertEquals(message, t.toString());

    }

    @Test
    public void testingAddReviewMethod() {
        Theater t = new Theater("south", "sun");
        t.numStars= 3;
        Review south = new Review("good", "zahra", 5);
        t.addReview(south);
        String message ="Theater: south\nMovie: sun Review: zahra good 4";
        assertEquals(message, t.toString());

    }
}