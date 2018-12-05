import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    String price;
    int numStars; //should be float later
    public String comment;
    public String author;


    public Shop (String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.numStars = 0 ;


    }
    @Override
    public String toString() {
        String shopInfo = this.name +" "+ this.description+" "+this.price+"\n";
        String review = "Review: "+this.numStars+" "+this.author+" "+this.comment;
        boolean bool = this.numStars == 0 && this.author == null && this.comment == null;
        return bool ? shopInfo : shopInfo+review;
    }

    public void addReview(Review review) {

        ArrayList<Integer> numStarsArr = new ArrayList<>();
        numStarsArr.add(review.numStars);
        if(this.numStars<=0){
            int sum =this.numStars +review.numStars;
            this.numStars = sum/numStarsArr.size();
        }else{
            int sum =this.numStars +review.numStars;
            this.numStars = sum/(numStarsArr.size()+1);
        }

        this.comment = review.comment;
        this.author = review.author;


    }

}
