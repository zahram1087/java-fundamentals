import sun.jvm.hotspot.utilities.BitMap;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {


    public static void main(String[] args) {
        //find an image
        Path imagePath = FileSystems.getDefault().getPath("resources", "test.bmp");

        //read the image
        Bitmap bmpDiagonally = new Bitmap(imagePath);
        //manipulate the image
        bmpDiagonally.flipDiagonally();
        //output the image
        bmpDiagonally.save(FileSystems.getDefault().getPath("resources", "img_Diagonally.bmp"));

        //read the image
        Bitmap bmpVertically = new Bitmap(imagePath);
        //manipulate the image
        bmpVertically.flipVertically();
        //output the image
        bmpVertically.save(FileSystems.getDefault().getPath("resources", "img_Vertically.bmp"));

        //read the image
        Bitmap bmpColorToGray = new Bitmap(imagePath);
        //manipulate the image
        bmpColorToGray.changeColorToGray();
        //output the image
        bmpColorToGray.save(FileSystems.getDefault().getPath("resources", "img_Gray.bmp"));

        //read the image
        Bitmap bmpColorToBlue = new Bitmap(imagePath);
        bmpColorToBlue.changeColorToBlue();
        //output the image
        bmpColorToBlue.save(FileSystems.getDefault().getPath("resources", "img_Blue.bmp"));


    }



}
