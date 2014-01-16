package imagebrowser.persistence;

import imagebrowser.model.Image;
import java.util.List;

public interface ImageListLoader {

    public List<Image> load();
}
