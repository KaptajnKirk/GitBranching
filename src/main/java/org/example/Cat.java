package org.example;

public class Cat extends Animal{
  public Cat() {
    super("Cat");
  }

  @Override
  public void makesound() {
    System.out.println("Miav");
  }
}
