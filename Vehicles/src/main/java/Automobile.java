public class Automobile implements Vehicle {

  private String vin;
  private Color color;
  private long miles;
  private boolean security;
  private int numberOfWheels;
  private int numberOfSeats;

  @Override
  public Color getColor() {
    return color;
  }

  @Override
  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public long getMiles() {
    return miles;
  }

  @Override
  public void setMiles(long miles) {
    this.miles = miles;
  }

  @Override
  public boolean isSecurity() {
    return security;
  }

  public void setSecurity(boolean security) {
    this.security = security;
  }

  @Override
  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  @Override
  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  @Override
  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  @Override
  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public void incrementMiles(long miles) {
    this.miles += miles;
  }

  @Override
  public String getVin() {
    return vin;
  }

  @Override
  public void setVin(String vin) {
    this.vin = vin;
  }
}
