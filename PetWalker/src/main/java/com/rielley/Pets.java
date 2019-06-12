package com.rielley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pets {

  private static List<String> STATUS_CODES = new ArrayList<>(
      Arrays.asList(
          new String[]{"Good", "Anxious", "Tired", "Sleepy"}
          )
  );

  private List<Dog> dogList = new ArrayList<>();

  private void printMessage() {
    System.out.println("PetWalker(r) -- meets all your pet walking needs");
  }

  private void printMenu() {
    System.out.println("1. Add Dog");
    System.out.println("2. Get Dog Status");
    System.out.println("3. Add all Statuses");
    System.out.println("4. Exit");
  }

  private void printStatusTypes() {
    int index = 0;
    for (String status : STATUS_CODES) {
      System.out.printf("\t %d: %s\n", ++index, STATUS_CODES.get(index-1));
    }
  }

  private void printDogTypeMenu() {
    System.out.println("1. A generic Dog");
    System.out.println("2. A Chihuahua");
  }

  public static void main(String[] args) {

    Pets pets = new Pets();
    pets.printMessage();
    int menuCode=0;

    Scanner scanner = new Scanner(System.in);

    do {
      pets.printMenu();
      menuCode = scanner.nextInt();
      try {
        if (menuCode == 1) {
          pets.printDogTypeMenu();
          Dog dog = new Dog();
          int subMenu = scanner.nextInt();
          if (subMenu == 2) {
            dog = new Chihuahua();
          } else if (subMenu != 1) {
            System.out.println("Must keep on the menu - no ala carte");
          }
          System.out.println("What is the dog's name?");
          String name = scanner.next();
          dog.setName(name);
          System.out.println("What is the dog's height?");
          int height = scanner.nextInt();
          dog.setHeight(height);
          System.out.println("What is the dog's weight?");
          int weight = scanner.nextInt();
          dog.setWeight(weight);
          pets.printStatusTypes();
          int subMenuCode = scanner.nextInt();
          int statusCount = STATUS_CODES.size();
          if (subMenuCode < 1 && subMenuCode > statusCount - 1) {
            dog.setStatus(subMenuCode);
          }
          pets.dogList.add(dog);
        } else if (menuCode == 2) {
          int d = 0;
          int count = pets.dogList.size();
          System.out.println("Dog List:");
          for (Dog dog : pets.dogList) {
            System.out.printf("\t%d: %s\n", ++d, dog.getName());
          }
          int whichDog = scanner.nextInt();
          if (whichDog > 0 && whichDog <= count) {
            Dog wDog = pets.dogList.get(whichDog);
            int wStatus = wDog.getStatus();
            String status = STATUS_CODES.get(wStatus);
            System.out.println("Dog Status = " + status);
          }
        } else if (menuCode == 3) {
          for (Dog dog : pets.dogList) {
            System.out.printf("\t%s is %s\n", dog.getName(), dog.getStatus());
          }
        } else if (menuCode != 4) {
          System.out.println("Oooooh, sorry, I don't that, try again");
        }
      } catch (ChihuahuaException c) {
        System.out.println(c.getMessage());
      }
    } while(menuCode != 4);

  }
}
