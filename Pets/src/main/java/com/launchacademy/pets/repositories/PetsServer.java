package com.launchacademy.pets.repositories;

import com.launchacademy.pets.models.Breeds;
import com.launchacademy.pets.models.Color;
import com.launchacademy.pets.models.Pet;
import com.launchacademy.pets.models.Species;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PetsServer {

  private List<Pet> petList = new ArrayList<>();

  public PetsServer() {
  }

  public List<Pet> findAll() {
    return petList;
  }

  public Pet save(String name, Species species, Breeds breed, Date adoptDate, Color color ) {
    Pet pet = new Pet(name, species, breed, adoptDate, color);
    petList.add(pet);
    return pet;
  }

  public Pet save( Pet pet) {
    petList.add(pet);
    return pet;
  }

}
