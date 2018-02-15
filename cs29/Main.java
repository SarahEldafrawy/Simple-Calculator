package eg.edu.alexu.csd.oop.calculator.cs29;

import java.awt.EventQueue;
import eg.edu.alexu.csd.oop.calculator.Calculator;

/**
 *
 * @author saraheldafrawy
 * class main linking MVC
 */
public final class Main {
  /**
   * private constructor for utility class.
   */
  private Main() {
  }
  /**
   * main function.
   * @param args parameter
   */
  public static void main(final String[] args) {
  EventQueue.invokeLater(new Runnable() {
    public void run() {
        View view = new View();
        Calculator model = new MySimpleCalculator();
        Controller controller = new Controller(model, view);
        view.setVisible(true);
        controller.control();
    }
  });
  }

}
