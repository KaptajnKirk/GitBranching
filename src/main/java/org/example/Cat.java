package org.example;

public class Cat extends Animal{
  public Cat() {
    super("Cat");
  }

  @Override
  public String makesound() {
    return "Miav";
  }
}
