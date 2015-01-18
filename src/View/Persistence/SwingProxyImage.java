package View.Persistence;

import Model.Bitmap;
import Model.Image;

public class SwingProxyImage implements Image {
    
    private final ImageLoader loader;
    
    private Image next;
    private Image prev;
    private Image currentImage;

    public SwingProxyImage (ImageLoader loader) {
        this.loader = loader;
    }
    
    @Override
    public Bitmap getBitmap() {
        if (currentImage == null) {
            currentImage = loader.load();
        }
        return currentImage.getBitmap();
    }
    
    @Override
    public Image getNext() {
        return next;
    }

    @Override
    public Image getPrev() {
        return prev;
    }

    public void setNext(Image image) {
        this.next=image;
    }

    public void setPrev(Image image) {
        this.prev=image;
    }
    
}