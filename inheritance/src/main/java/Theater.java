import java.util.ArrayList;

public class Theater { //hould have a name and all of the movies currently
    String name;
    String movie;
    ArrayList<String> storedMovies= new ArrayList<>();
    int numStars; //should be float later
    public String comment;
    public String author;
     ArrayList<Integer> numStarsArr = new ArrayList<>();

    public Theater(String name, String movie){
        this.name = name;
        this.movie = movie;
        storedMovies.add(movie);

    }

    public void addMovie (String newmovie){
        storedMovies.add(newmovie);
    }

    public void removeMovie(String submovie){
        for(int i = 0; i<storedMovies.size();i++){
            if(storedMovies.contains(submovie)){
                storedMovies.remove(submovie);
            }
        }
    }

    public void addReview(Review review) {

        ArrayList<Integer> numStarsArr = new ArrayList<>();
        numStarsArr.add(review.numStars);
        if(this.numStars<0){
            int sum =this.numStars +review.numStars;
            this.numStars = sum/numStarsArr.size();
        }else{
            int sum =this.numStars +review.numStars;
            this.numStars = sum/(numStarsArr.size()+1);
        }


        this.comment = review.comment;
        this.author = review.author;


    }

    @Override
    public String toString () {
        String listing ="";
        int newStars;

        for (int i = 0; i < storedMovies.size(); i++) {
            listing+= "\nMovie: "+this.storedMovies.get(i);
        }

        String TheaterInfo = "Theater: "+this.name+listing;
        String review = "Review: "+this.author+" "+this.comment+" "+this.numStars;
        boolean bool = this.numStars == 0 && this.author == null && this.comment == null;
        return bool ? TheaterInfo : TheaterInfo+" "+review;

   }


}
