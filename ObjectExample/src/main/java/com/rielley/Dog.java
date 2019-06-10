package com.rielley;

public class Dog implements Mammal {

  private int foodStore;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  public Dog() {
    this.name = "Skippy";
  };

  public Dog(String name) {
    this.name = name;
  }

  public void speak() {
    System.out.println("Bark");
  }

  public void sniff() {
    System.out.println("Sniff...sniff");
  }

  public void wagTail() {
    System.out.println("Thump");
  }
  public void eat() {
    foodStore++;
  }
}
