package com.rielley;

public class Cat implements Mammal {

  private int food;
  @Override
  public void speak() {
    System.out.println("Meeoooow");
  }

  @Override
  public void eat() {
    food++;
  }

  @Override
  public void wagTail() {
    System.out.println("Whooosh");
  }

  @Override
  public void sniff() {
    System.out.println("sniff");
  }
}
