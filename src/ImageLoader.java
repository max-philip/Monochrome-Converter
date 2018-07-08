import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageLoader {

    public String fileName;

    public ImageLoader() {
        this.fileName = "Picture.jpg";
    }

    public ImageDocument loadImage() {

        BufferedImage image;
        int width;
        int height;

        try {
            File input = new File("Picture.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            ImageDocument new_image = new ImageDocument(image, width, height);
            return new_image;
        } catch (Exception e){}

        return null;
    }

}
