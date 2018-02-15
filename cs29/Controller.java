package eg.edu.alexu.csd.oop.calculator.cs29;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import eg.edu.alexu.csd.oop.calculator.Calculator;
/**class controller.
 */
public class Controller {

  /**calculator.
   */
  private static Calculator model;
  /**view.
   */
  private View view;
  /**string parameter.
   */
  private StringBuilder str;
  /**
   *constructor.
   * @param mdl to pass model to controller
   * @param vw to pass view to controller
   */
  public Controller(final Calculator mdl, final View vw) {
      Controller.model = mdl;
      this.view = vw;
      this.str = new StringBuilder("");
  }
  /**controller method.
   */
  public void control() {
    view.getLoadButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        model.load();
        view.getLabelCurrent().setText(model.current());
      }
    });
    view.getSaveButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        model.save();
      }
    });
    view.getPreviousButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        model.prev();
        view.getLabelCurrent().setText(model.current());
      }
    });
    view.getNextButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        model.next();
        view.getLabelCurrent().setText(model.current());
      }
    });
    view.getZeroButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('0');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getDotButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('.');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getOneButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('1');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getTwoButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('2');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getThreeButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('3');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getFourButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('4');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getFiveButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('5');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getSixButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('6');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getSevenButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('7');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getEightButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('8');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getNineButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('9');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getPlusButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('+');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getMinusButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('-');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getDivisionButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('/');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getMultiplicationButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        str.append('*');
        view.getLabelFormula().setText(str.toString());
      }
    });
    view.getEqualButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        if (checkString(str.toString())) {
          if (!str.toString().isEmpty()) {
            model.input(str.toString());
          }
          view.getLabelResult().setText(model.getResult());
          str = new StringBuilder("");
          view.getLabelFormula().setText("Enter New Formula");
          view.getLabelCurrent().setText(model.current());
          }
      }
    });
  }
  /**
   * check.
   * @param string to check for valid string
   * @return bollean value
   */
  private boolean checkString(final String string) {
    return true;
    // TODO Auto-generated method stub
  }

}
