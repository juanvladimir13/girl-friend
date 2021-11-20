package com.juanvladimir13.love;

/**
 * 
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class Controller {
  private Model model;
  private View view;

  public Controller(Model model) {
    this.model = model;
    this.view = new View(
      model.getQuestion(), model.getTextOptionYes(), model.getTextOptionNot()
    );
    bindComponentsToEvents();
  }
  
  private void bindComponentsToEvents(){
    view.btnSi.addActionListener((evt) -> showResponse());
  }
  
  private void showResponse(){
    view.showResponse(model.getMessage());
  }
 
  public void showForm(){
    view.setVisible(true);
  }
}