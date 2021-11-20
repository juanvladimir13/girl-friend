package com.juanvladimir13.love;

/**
 *
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class Negocio {

  private Dato dato;

  public Negocio(Dato dato) {
    this.dato = dato;
  }

  public void setQuestionAndMessage(String question, String message) {
    dato.setQuestionAndMessage(question, message);
  }

  public void setTextOption(String textOptionYes, String textOptionNot) {
    dato.setTextOption(textOptionYes, textOptionNot);
  }

  public String getQuestion() {
    return dato.getQuestion();
  }

  public String getMessage() {
    return dato.getMessage();
  }

  public String getTextOptionYes() {
    return dato.getTextOptionYes();
  }

  public String getTextOptionNot() {
    return dato.getTextOptionNot();
  }

}
