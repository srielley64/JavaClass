package com.launchacademy.disample.model;

public interface Farm {
  boolean plow(int acreage);
  boolean harvest(int acreage);
  String getName();
  void setName(String name);
  String getType();
  void setType(String type);
  int getAcreage();
  void setAcreage(int acreage);

}
