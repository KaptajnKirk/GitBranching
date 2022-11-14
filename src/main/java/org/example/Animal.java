package org.example;

public abstract class Animal {

  private String name;

  protected Animal(String name) {
    this.name = name;
  }

  public abstract void makesound();

  public abstract boolean eat(String foodType);

  public abstract boolean showMood(String moodType);

}
