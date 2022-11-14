package org.example;

public class Dog extends Animal {
  public Dog() {
    super("Dog");
  }

  @Override
  public String makesound() {
    return "Vuf";
  }
}
