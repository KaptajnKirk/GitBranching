package org.example;

public class Main {

  public static void main(String[] args) {

  Cat cat = new Cat();

  Dog dog = new Dog();

 cat.makesound();
 dog.makesound();

 cat.eat("Catfood");
 dog.eat("Dogfood");
 dog.showMood("Logrer");
 cat.showMood("hvæser");
}
}