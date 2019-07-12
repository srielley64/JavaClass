package com.launchacademy.disample.repository;

import com.launchacademy.disample.model.Farm;
import java.util.List;

public interface FarmRepository {

  List<Farm> findAllFarms();
  List<Farm> findAllByType(int type);
  List<Farm> findByName(String name);
  List<Farm> findByAcreageBetween(int start, int stop);
}
