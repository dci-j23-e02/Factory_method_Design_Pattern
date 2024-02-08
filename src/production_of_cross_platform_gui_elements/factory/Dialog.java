package production_of_cross_platform_gui_elements.factory;

import production_of_cross_platform_gui_elements.buttons.Button;

public abstract  class Dialog {

  public void renderWindow() {
    // other code

    Button okButton = createButton();
    okButton.render();
  }


  public abstract Button createButton();

}
