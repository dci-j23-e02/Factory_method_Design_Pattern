package production_of_cross_platform_gui_elements.factory;

import production_of_cross_platform_gui_elements.buttons.Button;
import production_of_cross_platform_gui_elements.buttons.HtmlButton;

public class HtmlDialog extends  Dialog{

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
