package production_of_cross_platform_gui_elements;

import production_of_cross_platform_gui_elements.factory.Dialog;
import production_of_cross_platform_gui_elements.factory.HtmlDialog;
import production_of_cross_platform_gui_elements.factory.WindowsDialog;

public class Demo {

  private static Dialog dialog;

  public static void main(String[] args) {
    String osName = System.getProperty("os.name");
    System.out.println(osName);

    configure("Windows 10");
    runBusinessLogic();
  }

  private static void runBusinessLogic() {

    dialog.renderWindow();
  }

  private static void configure(String osName) {
    if(System.getProperty("os.name").equals(osName)) /*Windows 10*/{
      dialog = new WindowsDialog();
    }else{
      dialog = new HtmlDialog();
    }

  }



}
