package com.rielley;

public class Hound extends Dog {


  public Hound() {
    setName("Hunter");
  }

  public Hound( String name ) {
    setName(name);
  }

  @Override
  public void eat() {
    super.eat();
    super.eat();
  }
}
