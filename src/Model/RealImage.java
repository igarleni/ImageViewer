package Model;

public class RealImage implements Image {

    private Bitmap bitmap;
    
    public RealImage (Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    
    @Override
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override
    public Image getNext() {
        return null;
    }

    @Override
    public Image getPrev() {
        return null;
    }
       
}