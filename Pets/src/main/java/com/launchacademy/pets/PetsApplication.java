package com.launchacademy.pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.launchacademy.pets.repositories")
@SpringBootApplication
public class PetsApplication {

  public static void main(String[] args) {
    SpringApplication.run(PetsApplication.class, args);
  }

}
