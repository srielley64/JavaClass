package com.launchacademy.pets.models;

import java.util.Date;

public class Pet {

  private String name;
  private Species species;
  private Breeds breeds;
  private Date adoptedDate;
  private Color color;

  public Pet() {
  }

  public Pet(String name, Species species, Breeds breeds, Date adoptedDate,
      Color color) {
    this.name = name;
    this.species = species;
    this.breeds = breeds;
    this.adoptedDate = adoptedDate;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Species getSpecies() {
    return species;
  }

  public void setSpecies(Species species) {
    this.species = species;
  }

  public Breeds getBreeds() {
    return breeds;
  }

  public void setBreeds(Breeds breeds) {
    this.breeds = breeds;
  }

  public Date getAdoptedDate() {
    return adoptedDate;
  }

  public void setAdoptedDate(Date adoptedDate) {
    this.adoptedDate = adoptedDate;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Pet{" +
        "name='" + name + '\'' +
        ", species=" + species +
        ", breeds=" + breeds +
        ", adoptedDate=" + adoptedDate +
        ", color=" + color +
        '}';
  }
}