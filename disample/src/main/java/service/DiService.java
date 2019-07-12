package service;

import com.launchacademy.disample.model.Farm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiService {

  private Farm farm;


  @Autowired
  protected void setFarm( Farm farm) {
    this.farm = farm;
    System.out.println(farm.harvest(10));
    System.out.println(farm.getName());
    System.out.println(farm);
  }

  public Farm getFarm() {
    return farm;
  }
}
