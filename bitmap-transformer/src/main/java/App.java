import sun.jvm.hotspot.utilities.BitMap;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    //For this assignment you will be building a bitmap (.bmp) transformer CLI.
    // It will read a bitmap in from disk, run one or more color or raster transforms
    // and then write it out to a new file.
    //CLI should require 3: 1.input-file-path 2.output-file-path 3.transfrom-name.

    public static void main(String[] args) {


    }

    public static void blackAndWhite()  {
        //image source
        File startImage = new File("resources/original.bmp");
        BufferedImage img = null;

        try{
            img = ImageIO.read(startImage);

            //image for backandwhite-ing results
            BufferedImage blackandWhite = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);

            for(int i = 0, i< img.getWidth();i++){
                for(int j = 0; j< img.getWidth(); j++) {
                    //Create an instance of the BitMap class
                    BitMap color = new Bitmap()
                }
            };
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
