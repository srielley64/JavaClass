import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuoteTest {

  @Test
  public void testPerson() {
    Quote quote = new Quote();
    Person johnSmith = new Person("John", "Smith");
    quote.setPrimaryDriver(johnSmith);
    assertEquals(johnSmith, quote.getPrimaryDriver());
  }

  @Test
  public void testMileStatus() {
    Quote quote = new Quote();
    Vehicle vehicle = new Automobile();
    vehicle.setMiles(100000L);
    quote.setVehicle(vehicle);
    assertEquals(3, quote.getMileStatus());

  }
}