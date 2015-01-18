package View.Persistence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import Model.Image;
import Model.RealImage;

public class ImageCreator implements ImageLoader {
    
    private final String filename;
    
    public ImageCreator (String filename) {
        this.filename=filename;
    }

    public Image load() {
        try {
            return new RealImage(new SwingBitmap(Files.readAllBytes(new File(filename).toPath())));
        } catch (IOException ex) {
            return null;
        }
    }
}