package com.rielley.JavaClassroom;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SessionTest {

  @Test
  public void testNummberOfComputers() {
    Session session = new Session();
    assertEquals(5, session.getNumberOfPCComputers());
    assertEquals(5, session.getNumberOfMacComputers());
  }
}
