package org.example;

public class Dog extends Animal {
  public Dog() {
    super("Dog");
  }

  @Override
  public void makesound() {
    System.out.println("Vuf");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

  @Override
  public boolean showMood(String moodType) {
    return true;
  }
}
