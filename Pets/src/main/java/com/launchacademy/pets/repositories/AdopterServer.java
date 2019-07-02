package com.launchacademy.pets.repositories;

import com.launchacademy.pets.models.Adopter;
import com.launchacademy.pets.models.CatBreeds;
import com.launchacademy.pets.models.Color;
import com.launchacademy.pets.models.DogBreed;
import com.launchacademy.pets.models.Pet;
import com.launchacademy.pets.models.Species;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdopterServer {
  private List<Adopter> adopterList = new ArrayList<>();

  @Autowired
  PetsServer petsServer;

  private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
  public AdopterServer() {
    try {
      Pet pet = petsServer.save("Pancake", Species.Dog, DogBreed.Chug,
          simpleDateFormat.parse("2010-08-05"), Color.FAWN);
      petsServer.save(pet);
      Adopter adopter = new Adopter("Steve Rielley", pet);
      adopterList.add(adopter);
      pet = petsServer.save("Buckwheat", Species.Cat, CatBreeds.MaineCoon,
          simpleDateFormat.parse("2018-08-02"), Color.Grey);
      adopter = new Adopter("Steve Rielley", pet);
      adopterList.add(adopter);
    } catch (ParseException pe) {
      pe.getMessage();
    }
  }
  public List<Adopter> findAll() {
    return adopterList;
  }

  public void save(Adopter a) {
    adopterList.add(a);
  }

}
