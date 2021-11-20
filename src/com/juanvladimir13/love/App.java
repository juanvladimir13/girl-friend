package com.juanvladimir13.love;

/**
 * @github https://github.com/juanvladimir13
 * @author juanvladimir13<juanvladimir13@gmail.com>
 */
public class App {
  public static void main(String[] args) {    
    String question = "Quieres ser mi novia ?";
    String message = "Sabia que dirias que si !!";
    String textOptionYes = "SI";
    String textOptionNot = "NO";
    
    Dato dato = new Dato();
    dato.setQuestionAndMessage(question, message);
    dato.setTextOption(textOptionYes, textOptionNot);
    
    Presentacion presentacion = new Presentacion(dato);
    presentacion.showForm();
  }
}
