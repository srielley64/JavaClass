package com.rielley;

public class Chihuahua extends Dog {

  // Have to create since the compiler w
  public Chihuahua() {
    super();
  }

  public Chihuahua(String name) {
    super(name);
  }

  public Chihuahua( String name, int height, int weight) throws ChihuahuaException {
    super(name);
    setHeight(height);
    setWeight(weight);
  }

  @Override
  public void setWeight(int weight) throws ChihuahuaException {
    if (weight > 0 && weight < 20) {
      super.setWeight(weight);
    } else {
      throw new ChihuahuaException("Too heavy for a Chihuahua");
    }
  }

  @Override
  public void setHeight(int height) throws ChihuahuaException {
    if (height > 0 && height < 12) {
      super.setHeight(height);
    } else {
      throw new ChihuahuaException("Too tall for a Chihuahua");
    }
  }
}
