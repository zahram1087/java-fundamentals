import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

public class Bitmap {
    public  Path path;
    public BufferedImage imageData;
    public BufferedImage imageTest;
    public Bitmap(Path imagePath){
        this.path = imagePath;
        //actually read in file  and save that data in a instance in an instance variable
        BufferedImage img = null;
        try {
            img = ImageIO.read(imagePath.toFile());
            this.imageData = img;

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Methods to manipulate the image
    public void flipVertically(){
        //logic on the instance variable to flip it
        //take each row, reverse it
        for(int i =0; i<this.imageData.getHeight(); i++){ //looping through each row making current row =i
            for(int j = 0; j<this.imageData.getWidth() / 2; j++){//within the row; reversing it
                int temp = this.imageData.getRGB(i,j); //grabbing from i,j
                //setting the imageData at i,j to be whatever I get from the same row(i) but width minus j minus 1
                this.imageData.setRGB(i,j, this.imageData.getRGB(i, this.imageData.getWidth()-j-1 ));
                //setting at that same location whatever sorted at top
                this.imageData.setRGB(i, this.imageData.getWidth()-j-1, temp );
            }
        }

    }

    public void flipDiagonally(){

        for(int i =0; i<this.imageData.getWidth(); i++){
            for(int j = 0; j<this.imageData.getHeight() / 2; j++){
                int temp = this.imageData.getRGB(i,j);
                this.imageData.setRGB(i,j, this.imageData.getRGB(j, this.imageData.getWidth()-i-1 ));
                this.imageData.setRGB(j, this.imageData.getWidth()-i-1, temp );
            }
        }
    }

    public void changeColorToGray(){

        for(int i = 0; i<this.imageData.getWidth(); i++){
            for(int j = 0; j<this.imageData.getWidth(); j++){

                Color temp = new Color(this.imageData.getRGB(j,i));
                int r = temp.getRed();
                int g = temp.getGreen();
                int b = temp.getBlue();
                int a = temp.getAlpha();
                int p = temp.getTransparency();
                int average = (r+g+b)/3;

                Color blueColor = new Color (average,average,average,a);
                this.imageData.setRGB(j,i,blueColor.getRGB()) ;
            }
        }
    }

    public void changeColorToBlue(){

        for(int i = 0; i<this.imageData.getHeight(); i++){
            for(int j = 0; j<this.imageData.getWidth(); j++){
             Color temp =  new Color(this.imageData.getRGB(i,j));

                int r = temp.getRed();
                int g = temp.getGreen();
                int b = temp.getBlue();
                int a = temp.getAlpha();
                int p = temp.getTransparency();

             int average =r+g/2;
               Color someColor = new Color(average);
             this.imageData.setRGB(i,j,someColor.getRGB());
            }
        }
    }

    //Saving the image
    public boolean save(Path savePath){
        //output instance variable data into a file at the saved path
        try{
            return ImageIO.write( imageData, "bmp", savePath.toFile());
        }catch (IOException e){
            e.printStackTrace();
        }
         return false;
    }
    //creating new constructor for testing
    public Bitmap (BufferedImage image){
        this.imageTest = image;
    }

}
