package production_of_cross_platform_gui_elements.factory;

import production_of_cross_platform_gui_elements.buttons.Button;
import production_of_cross_platform_gui_elements.buttons.WindowsButton;

public class WindowsDialog extends  Dialog{

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
