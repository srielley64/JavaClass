package com.rielley;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectExample {

  private static final Logger logger = LoggerFactory.getLogger(ObjectExample.class);

  public static void main(String[] args) {
    Mammal dog = new Dog();
    Mammal cat = new Cat();
    logger.info("Setting up a Hound named Hugh");
    Hound hound = new Hound("Hugh");
    dog.eat();
    cat.sniff();
    dog.speak();
    cat.speak();
    hound.speak();
  }
}
