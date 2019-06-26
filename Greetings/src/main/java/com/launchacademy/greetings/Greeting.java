package com.launchacademy.greetings;

public class Greeting {

  private String firstName;
  private String lastName;
  private String language;

  public Greeting() {
  }

  public Greeting(String firstName, String lastName, String language) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.language = language;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public String toString() {
    return "Greeting{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", language='" + language + '\'' +
        '}';
  }
}
