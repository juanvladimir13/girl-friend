package com.juanvladimir13.love;

/**
 *
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class Model {
  private String question, message;
  private String textOptionYes, textOptionNot;

  public Model() {
    this.question = "Quieres ser mi novia ?";
    this.message = "Sabia que dirias que si !!";
    this.textOptionYes = "SI";
    this.textOptionNot = "NO";
  }
  
  public void setQuestionAndMessage(String question, String message){
    this.question = question;
    this.message = message;
  }
  
  public void setTextOption(String textOptionYes, String textOptionNot){
    this.textOptionYes = textOptionYes;
    this.textOptionNot = textOptionNot;
  }

  public String getQuestion() {
    return question;
  }

  public String getMessage() {
    return message;
  }

  public String getTextOptionYes() {
    return textOptionYes;
  }

  public String getTextOptionNot() {
    return textOptionNot;
  }
}
