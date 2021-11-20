package com.juanvladimir13.love;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class View extends JFrame {

  public final JButton btnNo;
  public final JButton btnSi;
  private JLabel labPregunta;

  public View(String question, String textOptionYes, String textOptionNot) {
    super("Pliss");

    // Centrar formulario en la pantalla
    int minWidth = 500;
    int minHeight = 400;

    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int height = (screen.height / 2) - (minHeight);
    int width = (screen.width / 2) - (minWidth);

    setMinimumSize(new Dimension(minWidth, minHeight));
    setSize(width, height);
    setLocationRelativeTo(null);
    setResizable(true);

    // Eliminar el orden de los componentes
    setLayout(null);
    labPregunta = new JLabel();
    labPregunta.setFont(new java.awt.Font("Dialog", 1, 18));
    labPregunta.setText(question);
    labPregunta.setSize(300, 40);
    labPregunta.setLocation(50, 40);

    btnSi = new JButton();
    btnSi.setText(textOptionYes);
    btnSi.setSize(70, 25);
    btnSi.setLocation(50, 80);

    btnNo = new JButton();
    btnNo.setText(textOptionNot);
    btnNo.setSize(70, 25);
    btnNo.setLocation(150, 80);

    // Agregando componentes al JFrame
    add(labPregunta);
    add(btnSi);
    add(btnNo);

    
    btnNo.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseMoved(MouseEvent evt) {
        moveButton();
      }
    });
    
    btnNo.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent evt) {
        moveButton();
      }
    });
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    pack();
  }

  private void moveButton() {
    int x, y;

    do {
      x = Utils.formRandomPosition(getWidth());
      y = Utils.formRandomPosition(getHeight());
    } while (x < 350 && y < 120);

    btnNo.setLocation(x, y);
    repaint();
  }

  public void showResponse(String message) {
    JOptionPane.showMessageDialog(this, message);
  }
}
