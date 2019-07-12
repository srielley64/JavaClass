package com.launchacademy.pets.models;

import org.springframework.stereotype.Component;

@Component
public class Adopter {

  private String name;
  private Pet pet;

  public Adopter() {
  }

  public Adopter(String name, Pet pet) {
    this.name = name;
    this.pet = pet;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  @Override
  public String toString() {
    return "Adopter{" +
        "name='" + name + '\'' +
        ", pet=" + pet +
        '}';
  }
}
