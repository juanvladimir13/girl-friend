package com.juanvladimir13.love;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @github https://github.com/juanvladimir13
 * @author juanvladimir13<juanvladimir13@gmail.com>
 */
public class Form extends JFrame {

  private JButton btnNo;
  private JButton btnSi;
  private JLabel labPregunta;

  public Form() {
    super("Pliss");

    // Centrar formulario en la pantalla
    int minWidth = 500;
    int minHeight = 400;

    Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    int height = (pantalla.height / 2) - (minHeight);
    int width = (pantalla.width / 2) - (minWidth);

    setMinimumSize(new Dimension(minWidth, minHeight));
    setSize(width, height);
    setLocationRelativeTo(null);
    setResizable(true);

    // Eliminar el orden de los componentes
    setLayout(null);
    labPregunta = new JLabel();
    labPregunta.setFont(new java.awt.Font("Dialog", 1, 18));
    labPregunta.setText("Quieres ser mi novia ?");
    labPregunta.setSize(300, 40);
    labPregunta.setLocation(50, 40);

    btnSi = new JButton();
    btnSi.setText("SI");
    btnSi.setSize(70, 25);
    btnSi.setLocation(50, 80);

    btnNo = new JButton();
    btnNo.setText("NO");
    btnNo.setSize(70, 25);
    btnNo.setLocation(150, 80);
    
    // Agregando componentes al JFrame
    add(labPregunta);
    add(btnSi);
    add(btnNo);

    // Agregando eventos a los buttons
    addEventToButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    pack();
  }

  private void addEventToButton() {
    btnSi.addActionListener((ActionEvent evt) -> {
      showMessage();
    });
    
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
  }

  private void moveButton() {
    int x, y;
    
    do {
      x = formRandomPosition(getWidth());
      y = formRandomPosition(getHeight());
    } while (x < 350 && y < 120);

    btnNo.setLocation(x, y);
    repaint();
  }

  private void showMessage() {
    JOptionPane.showMessageDialog(this, "Sabia que dirias que si !!");
  }

  private int formRandomPosition(int sizeForm) {
    int pantalla = (int) (sizeForm / 1.5);
    return (int) Math.floor(Math.random() * (1 - pantalla + 1) + pantalla);
  }
}
