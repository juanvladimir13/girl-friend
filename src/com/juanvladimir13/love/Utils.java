package com.juanvladimir13.love;

/**
 * 
 * @author juanvladimir13<juanvladimir13@gmail.com>
 * @see https://github.com/juanvladimir13
 */
public class Utils {
  public static int formRandomPosition(int sizeForm) {
    int screen = (int) (sizeForm / 1.5);
    return (int) Math.floor(Math.random() * (1 - screen + 1) + screen);
  }
}
