import java.util.ArrayList;

public class Review {
    public String comment;
    public String author;
    public int numStars;
    public String movie;


    public Review (String comment, String author, int numStars){
        this.comment = comment;
        this.author = author;
        this.numStars = numStars;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return this.author+this.comment+this.numStars;

    }

}
