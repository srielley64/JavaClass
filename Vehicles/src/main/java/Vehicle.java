public interface Vehicle {

  String getVin();
  void setVin(String vin);

  Color getColor();
  void setColor(Color color);

  long getMiles();
  void setMiles(long miles);

  boolean isSecurity();
  void setSecurity(boolean security);

  int getNumberOfWheels();
  void setNumberOfWheels( int number);

  int getNumberOfSeats();
  void setNumberOfSeats(int count);
}
