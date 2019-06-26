import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AutomobileTest {

  @Test
  public void testMilesIncrease() {
    Automobile auto = new Automobile();
    auto.setMiles(1000L);
    auto.incrementMiles(20000L);
    assertEquals( 1000L + 20000L, auto.getMiles());
  }

}
