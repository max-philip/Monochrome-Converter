import java.awt.image.BufferedImage;

public class ImageDocument {

    BufferedImage image;
    int width;
    int height;

    public ImageDocument(BufferedImage image, int width, int height){
        this.image = image;
        this.width = width;
        this.height = height;
    }
}
