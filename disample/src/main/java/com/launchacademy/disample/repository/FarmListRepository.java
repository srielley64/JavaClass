package com.launchacademy.disample.repository;

import com.launchacademy.disample.model.Farm;
import java.util.ArrayList;
import java.util.List;

public class FarmListRepository implements FarmRepository {
  private List<Farm> farm = new ArrayList<>();

  @Override
  public List<Farm> findAllFarms() {
    List<Farm> cFarm = new ArrayList<>(farm);
    return cFarm;
  }

  @Override
  public List<Farm> findAllByType(int type) {
    List<Farm> tFarm = new ArrayList<>();
    for (Farm farm : this.farm) {
      if (farm.getType().equals(type)) {
        tFarm.add(farm);
      }
    }
    return tFarm;
  }

  @Override
  public List<Farm> findByName(String name) {
    List<Farm> tFarm = new ArrayList<>();
    for (Farm farm : this.farm) {
      if (farm.getName().equals(name)) {
        tFarm.add(farm);
      }
    }
    return tFarm;
  }

  @Override
  public List<Farm> findByAcreageBetween(int start, int stop) {
    List<Farm> tFarm = new ArrayList<>();
    for (Farm farm : this.farm) {
      int acreage = farm.getAcreage();
      if (acreage > start && acreage < stop) {
        tFarm.add(farm);
      }
    }
    return tFarm;
  }
}
