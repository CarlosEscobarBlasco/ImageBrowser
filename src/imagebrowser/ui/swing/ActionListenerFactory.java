package imagebrowser.ui.swing;

import java.awt.event.ActionListener;

public interface ActionListenerFactory {

    public ActionListener create(String action);
}