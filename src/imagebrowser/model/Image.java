package imagebrowser.model;

public interface Image {

    public Bitmap getBitmap();

    public Image getNextImage();

    public Image getPrevImage();

    public void setNextImage(Image nextImage);

    public void setPrevImage(Image prevImage);
}
