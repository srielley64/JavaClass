package com.launchacademy.disample.model;

import org.springframework.stereotype.Component;

@Component
public class CornFarm implements Farm {

  private String name;
  private String type;
  private int acreage;

  public CornFarm() {
    type="Corn";
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getAcreage() {
    return acreage;
  }

  public void setAcreage(int acreage) {
    this.acreage = acreage;
  }

  @Override
  public boolean plow(int acreage) {
    if (acreage > this.acreage) {
      return false;
    }
    return true;
  }

  @Override
  public boolean harvest(int acreage) {
    if (acreage > this.acreage) {
      return false;
    }
    return true;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "CornFarm{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", acreage=" + acreage +
        '}';
  }
}
