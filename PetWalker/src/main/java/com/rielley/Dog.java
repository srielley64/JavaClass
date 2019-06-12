package com.rielley;


public class Dog {

  // Class level unique ids for IDs
  private static int DogIDs;

  // instance level variable for the dog's id
  private int id;

  private String name;

  private int status;

  private int weight;

  private int height;

  // Create Constuctor

  public Dog() {
    id = DogIDs++;
    name = "Skippy";
  }

  public Dog(String name) {
    this(); // call Dog();
    this.name = name;
  }

  public Dog(String name, int height, int weight ) {
    this(name);
    this.height = height;
    this.weight = weight;
  }

  public static int getDogIDs() {
    return DogIDs;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name != null && !name.isEmpty()) {
      this.name = name;
    }
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) throws ChihuahuaException {
    this.weight = weight;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) throws ChihuahuaException {
    this.height = height;
  }
}
