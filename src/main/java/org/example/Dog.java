package org.example;

public class Dog extends Animal {
  public Dog() {
    super("Dog");
  }

  @Override
  public void makesound() {
    System.out.println("Vuf");
  }
}
