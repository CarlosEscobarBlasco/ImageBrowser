package imagebrowser.persistence.file;

import imagebrowser.model.Image;
import imagebrowser.persistence.ImageListLoader;
import imagebrowser.persistence.ProxyImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileImageListLoader implements ImageListLoader {

    private String path;

    public FileImageListLoader(String path) {
        this.path = path;
    }

    @Override
    public List<Image> load() {
        return linkImages(loadImages());
    }

    private List<Image> loadImages() {
        List<Image> list = new ArrayList<>();
        for (String file : new File(path).list())
            list.add(new ProxyImage(new FileImageLoader(path + "/" + file)));
        return list;
    }

    private List<Image> linkImages(List<Image> images) {
        for (int i = 0; i < images.size(); i++) {
            Image image = images.get(i);
            image.setNextImage(images.get(getNextIndex(i, images.size())));
            image.setPrevImage(images.get(getPrevIndex(i, images.size())));
        }
        return images;
    }

    private int getNextIndex(int i, int length) {
        return (i + 1) % length;
    }

    private int getPrevIndex(int i, int length) {
        return (i + length - 1) % length;
    }
}
