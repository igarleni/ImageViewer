package View.Persistence;

import Model.Bitmap;

import Model.Bitmap;

public class SwingBitmap implements Bitmap {

    private byte [] pixels;
    
    public SwingBitmap (byte [] pixels) {
        this.pixels=pixels;
    }
    
    @Override
    public byte[] getPixels() {
        return this.pixels;
    }
    
}