package com.rielley.greeting;

public class Greeting {
  private static final String message = "Hello! My name is %s";
  private String name;

  public Greeting(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getMessage() {
    return String.format(message, name);
  }

}
