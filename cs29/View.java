package eg.edu.alexu.csd.oop.calculator.cs29;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
/**
 *
 * @author saraheldafrawy
 *
 */
public class View extends JFrame {

  /**?!.
   */
  private static final long serialVersionUID = 1L;
  /**content panel.
   */
  private JPanel contentPane;

  /**labels.
   */
  private JLabel lblCurrent, lblResult, lblFormula;

  /**buttons.
   */
  private JButton btnH, button13, button17, button16, btnJ, button9,
  button14, button11, button12, button15, button1, button2, button3,
  button4, button5, button6, button7, button8, button, btnPrev;

  /**numbers.
   */
  private final int num500 = 500, num350 = 350, num150 = 150, num115 = 110,
      num34 = 34, num20 = 20, num7 = 7, num6 = 6, num5 = 5, num4 = 4, num3 = 3;

  /**
   * Launch the application.
   */
//  public static void main(String[] args) {
//    EventQueue.invokeLater(new Runnable() {
//      public void run() {
//        try {
//          View frame = new View();
//          frame.setVisible(true);
//        } catch (Exception e) {
//          e.printStackTrace();
//        }
//      }
//    });
//  }

  /**
   * Create the frame.
   */
  public View() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(num150, num150, num500, num350);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(num20, num20, num20, num20));
    setContentPane(contentPane);
    GridBagLayout gblContentPane = new GridBagLayout();
    gblContentPane.columnWidths = new int[]{num115, num115, num115, num115, 0};
    gblContentPane.rowHeights = new int[]{
        num34, num34, num34, num34, num34, num34, num34, num34, num34, 0};
    gblContentPane.columnWeights = new double[]{
        0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gblContentPane.rowWeights = new double[]{
        0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    contentPane.setLayout(gblContentPane);

    lblCurrent = new JLabel("Current");
    GridBagConstraints gbcLblCurrent = new GridBagConstraints();
    gbcLblCurrent.fill = GridBagConstraints.BOTH;
    gbcLblCurrent.insets = new Insets(0, 0, num5, num5);
    gbcLblCurrent.gridx = 0;
    gbcLblCurrent.gridy = 0;
    contentPane.add(lblCurrent, gbcLblCurrent);

    lblFormula = new JLabel("Formula");
    GridBagConstraints gbcLblFormula = new GridBagConstraints();
    gbcLblFormula.fill = GridBagConstraints.BOTH;
    gbcLblFormula.insets = new Insets(0, 0, num5, num5);
    gbcLblFormula.gridx = 0;
    gbcLblFormula.gridy = 1;
    contentPane.add(lblFormula, gbcLblFormula);

    lblResult = new JLabel("Result");
    GridBagConstraints gbcLblResult = new GridBagConstraints();
    gbcLblResult.fill = GridBagConstraints.BOTH;
    gbcLblResult.insets = new Insets(0, 0, num5, num5);
    gbcLblResult.gridx = 0;
    gbcLblResult.gridy = 2;
    contentPane.add(lblResult, gbcLblResult);

    button15 = new JButton("/");
    GridBagConstraints gbcButton15 = new GridBagConstraints();
    gbcButton15.fill = GridBagConstraints.BOTH;
    gbcButton15.insets = new Insets(0, 0, num5, num5);
    gbcButton15.gridx = 0;
    gbcButton15.gridy = num3;
    contentPane.add(button15, gbcButton15);

    button14 = new JButton("*");
    GridBagConstraints gbcButton14 = new GridBagConstraints();
    gbcButton14.fill = GridBagConstraints.BOTH;
    gbcButton14.insets = new Insets(0, 0, num5, num5);
    gbcButton14.gridx = 1;
    gbcButton14.gridy = num3;
    contentPane.add(button14, gbcButton14);

    button13 = new JButton("-");
    GridBagConstraints gbcButton13 = new GridBagConstraints();
    gbcButton13.fill = GridBagConstraints.BOTH;
    gbcButton13.insets = new Insets(0, 0, num5, num5);
    gbcButton13.gridx = 2;
    gbcButton13.gridy = num3;
    contentPane.add(button13, gbcButton13);

    button16 = new JButton("+");
    GridBagConstraints gbcButton16 = new GridBagConstraints();
    gbcButton16.fill = GridBagConstraints.BOTH;
    gbcButton16.insets = new Insets(0, 0, num5, 0);
    gbcButton16.gridx = num3;
    gbcButton16.gridy = num3;
    contentPane.add(button16, gbcButton16);

    button7 = new JButton("7");
    GridBagConstraints gbcButton7 = new GridBagConstraints();
    gbcButton7.fill = GridBagConstraints.BOTH;
    gbcButton7.insets = new Insets(0, 0, num5, num5);
    gbcButton7.gridx = 0;
    gbcButton7.gridy = num4;
    contentPane.add(button7, gbcButton7);

    button4 = new JButton("8");
    GridBagConstraints gbcButton4 = new GridBagConstraints();
    gbcButton4.fill = GridBagConstraints.BOTH;
    gbcButton4.insets = new Insets(0, 0, num5, num5);
    gbcButton4.gridx = 1;
    gbcButton4.gridy = num4;
    contentPane.add(button4, gbcButton4);

    button8 = new JButton("9");
    GridBagConstraints gbcButton8 = new GridBagConstraints();
    gbcButton8.fill = GridBagConstraints.BOTH;
    gbcButton8.insets = new Insets(0, 0, num5, num5);
    gbcButton8.gridx = 2;
    gbcButton8.gridy = num4;
    contentPane.add(button8, gbcButton8);

    btnPrev = new JButton("Previous");
    GridBagConstraints gbcBtnPrev = new GridBagConstraints();
    gbcBtnPrev.fill = GridBagConstraints.BOTH;
    gbcBtnPrev.insets = new Insets(0, 0, num5, 0);
    gbcBtnPrev.gridx = num3;
    gbcBtnPrev.gridy = num4;
    contentPane.add(btnPrev, gbcBtnPrev);

    button3 = new JButton("4");
    GridBagConstraints gbcButton3 = new GridBagConstraints();
    gbcButton3.fill = GridBagConstraints.BOTH;
    gbcButton3.insets = new Insets(0, 0, num5, num5);
    gbcButton3.gridx = 0;
    gbcButton3.gridy = num5;
    contentPane.add(button3, gbcButton3);

    button5 = new JButton("5");
    GridBagConstraints gbcButton5 = new GridBagConstraints();
    gbcButton5.fill = GridBagConstraints.BOTH;
    gbcButton5.insets = new Insets(0, 0, num5, num5);
    gbcButton5.gridx = 1;
    gbcButton5.gridy = num5;
    contentPane.add(button5, gbcButton5);

    button6 = new JButton("6");
    GridBagConstraints gbcButton6 = new GridBagConstraints();
    gbcButton6.fill = GridBagConstraints.BOTH;
    gbcButton6.insets = new Insets(0, 0, num5, num5);
    gbcButton6.gridx = 2;
    gbcButton6.gridy = num5;
    contentPane.add(button6, gbcButton6);

    button12 = new JButton("Next");
    GridBagConstraints gbcButton12 = new GridBagConstraints();
    gbcButton12.fill = GridBagConstraints.BOTH;
    gbcButton12.insets = new Insets(0, 0, num5, 0);
    gbcButton12.gridx = num3;
    gbcButton12.gridy = num5;
    contentPane.add(button12, gbcButton12);

    buttonConstructor();
    button1Constructor();
    button2Constructor();
    button11Constructor();
    button9Constructor();
    button17Cobstructor();
    btnHConstructor();
    btnJConstructor();
  }
  /**set properties.
   */
  private void buttonConstructor() {
    button = new JButton("1");
    GridBagConstraints gbcButton = new GridBagConstraints();
    gbcButton.fill = GridBagConstraints.BOTH;
    gbcButton.insets = new Insets(0, 0, num5, num5);
    gbcButton.gridx = 0;
    gbcButton.gridy = num6;
    contentPane.add(button, gbcButton);
  }
  /**set properties.
   */
  private void button1Constructor() {
    button1 = new JButton("2");
    GridBagConstraints gbcButton1 = new GridBagConstraints();
    gbcButton1.fill = GridBagConstraints.BOTH;
    gbcButton1.insets = new Insets(0, 0, num5, num5);
    gbcButton1.gridx = 1;
    gbcButton1.gridy = num6;
    contentPane.add(button1, gbcButton1);
  }
  /**set properties.
   */
  private void button2Constructor() {
    button2 = new JButton("3");
    GridBagConstraints gbcButton2 = new GridBagConstraints();
    gbcButton2.fill = GridBagConstraints.BOTH;
    gbcButton2.insets = new Insets(0, 0, num5, num5);
    gbcButton2.gridx = 2;
    gbcButton2.gridy = num6;
    contentPane.add(button2, gbcButton2);
  }
  /**set properties.
   */
  private void button11Constructor() {
    button11 = new JButton("Load");
    GridBagConstraints gbcButton11 = new GridBagConstraints();
    gbcButton11.fill = GridBagConstraints.BOTH;
    gbcButton11.insets = new Insets(0, 0, num5, 0);
    gbcButton11.gridx = num3;
    gbcButton11.gridy = num6;
    contentPane.add(button11, gbcButton11);
  }
  /**set properties.
   */
  private void button9Constructor() {
    button9 = new JButton("0");
    GridBagConstraints gbcButton9 = new GridBagConstraints();
    gbcButton9.fill = GridBagConstraints.BOTH;
    gbcButton9.insets = new Insets(0, 0, num5, num5);
    gbcButton9.gridx = 0;
    gbcButton9.gridy = num7;
    contentPane.add(button9, gbcButton9);
  }
  /**set properties.
   */
  private void button17Cobstructor() {
    button17 = new JButton(".");
    GridBagConstraints gbcButton17 = new GridBagConstraints();
    gbcButton17.fill = GridBagConstraints.BOTH;
    gbcButton17.insets = new Insets(0, 0, num5, num5);
    gbcButton17.gridx = 1;
    gbcButton17.gridy = num7;
    contentPane.add(button17, gbcButton17);
  }
  /**set properties.
   */
  private void btnHConstructor() {
    btnH = new JButton("=");
    GridBagConstraints gbcBtnH = new GridBagConstraints();
    gbcBtnH.fill = GridBagConstraints.BOTH;
    gbcBtnH.insets = new Insets(0, 0, num5, num5);
    gbcBtnH.gridx = 2;
    gbcBtnH.gridy = num7;
    contentPane.add(btnH, gbcBtnH);
  }
  /**set properties.
   */
  private void btnJConstructor() {
    btnJ = new JButton("Save");
    GridBagConstraints gbcBtnJ = new GridBagConstraints();
    gbcBtnJ.fill = GridBagConstraints.BOTH;
    gbcBtnJ.insets = new Insets(0, 0, num5, 0);
    gbcBtnJ.gridx = num3;
    gbcBtnJ.gridy = num7;
    contentPane.add(btnJ, gbcBtnJ);
  }
  /**@return component
   */
  public JLabel getLabelCurrent() {
    return lblCurrent;
  }
  /**@return component
   */
  public JLabel getLabelFormula() {
    return lblFormula;
  }
  /**@return component
   */
  public JLabel getLabelResult() {
    return lblResult;
  }
  /**@return component
   */
  public JButton getSaveButton() {
    return btnJ;
  }
  /**@return component
   */
  public JButton getLoadButton() {
    return button11;
  }
  /**@return component
   */
  public JButton getNextButton() {
    return button12;
  }
  /**@return component
   */
  public JButton getPreviousButton() {
    return btnPrev;
  }
  /**@return component
   */
  public JButton getEqualButton() {
    return btnH;
  }
  /**@return component
   */
  public JButton getMinusButton() {
    return button13;
  }
  /**@return component
   */
  public JButton getPlusButton() {
    return button16;
  }
  /**@return component
   */
  public JButton getMultiplicationButton() {
    return button14;
  }
  /**@return component
   */
  public JButton getDivisionButton() {
    return button15;
  }
  /**@return component
   */
  public JButton getDotButton() {
    return button17;
  }
  /**@return component
   */
  public JButton getZeroButton() {
    return button9;
  }
  /**@return component
   */
  public JButton getOneButton() {
    return button;
  }
  /**@return component
   */
  public JButton getTwoButton() {
    return button1;
  }
  /**@return component
   */
  public JButton getThreeButton() {
    return button2;
  }
  /**@return component
   */
  public JButton getFourButton() {
    return button3;
  }
  /**@return component
   */
  public JButton getFiveButton() {
    return button5;
  }
  /**@return component
   */
  public JButton getSixButton() {
    return button6;
  }
  /**@return component
   */
  public JButton getSevenButton() {
    return button7;
  }
  /**@return component
   */
  public JButton getEightButton() {
    return button4;
  }
  /**@return component
   */
  public JButton getNineButton() {
    return button8;
  }

}
