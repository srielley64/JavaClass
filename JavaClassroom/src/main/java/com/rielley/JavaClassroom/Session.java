package com.rielley.JavaClassroom;

public class Session {

  int numberOfPCComputers = 0;
  int numberOfMacComputers = 0;

  public Session() {
    this.numberOfMacComputers = 5;
    this.numberOfPCComputers = 5;
  }

  public int getNumberOfPCComputers() {
    return numberOfPCComputers;
  }

  public int getNumberOfMacComputers() {
    return numberOfMacComputers;
  }
}
