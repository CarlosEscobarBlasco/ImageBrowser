package imagebrowser.control;

import imagebrowser.ui.ImageViewer;

public interface ImageCommand {

    public ImageViewer getViewer();

    public abstract void execute();
}
