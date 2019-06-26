public class Quote {

  public Quote() {};

  private Person primaryDriver;
  private Vehicle vehicle;

  public Person getPrimaryDriver() {
    return primaryDriver;
  }

  public void setPrimaryDriver( Person primaryDriver) {
    this.primaryDriver = primaryDriver;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public int getMileStatus() {
    long miles = vehicle.getMiles();

    if (miles < 0 ) {
      return 0;
    } else if (miles > 0 && miles < 100) {
      return 1;
    } else if (miles > 100 && miles < 10000) {
      return 2;
    } else {
      return 3;
    }
  }
}
