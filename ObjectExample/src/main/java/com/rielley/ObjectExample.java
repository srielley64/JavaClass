package com.rielley;

public class ObjectExample {

  public static void main(String[] args) {
    Mammal dog = new Dog();
    Mammal cat = new Cat();
    Hound hound = new Hound("Hugh");
    dog.eat();
    cat.sniff();
    dog.speak();
    cat.speak();
    hound.speak();
  }
}
