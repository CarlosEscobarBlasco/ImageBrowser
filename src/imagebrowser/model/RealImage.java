package imagebrowser.model;

public class RealImage implements Image {

    private final Bitmap bitmap;
    private Image nextImage;
    private Image prevImage;

    public RealImage(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public Bitmap getBitmap() {
        return bitmap;
    }

    @Override
    public Image getNextImage() {
        return nextImage;
    }

    @Override
    public Image getPrevImage() {
        return prevImage;
    }

    @Override
    public void setNextImage(Image nextImage) {
        this.nextImage = nextImage;
    }

    @Override
    public void setPrevImage(Image prevImage) {
        this.prevImage = prevImage;
    }
}
