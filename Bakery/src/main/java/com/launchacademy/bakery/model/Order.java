package com.launchacademy.bakery.model;

public class Order {

  private int orderNumber;
  private String userName;
  private String itemName;
  private int quantity;
  private boolean glutenFree;
  private boolean vegan;

  public Order() {}

  public Order(int orderNumber, String userName, String itemName, int quantity, boolean glutenFree,
      boolean vegan) {
    this.orderNumber = orderNumber;
    this.userName = userName;
    this.itemName = itemName;
    this.quantity = quantity;
    this.glutenFree = glutenFree;
    this.vegan = vegan;
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isGlutenFree() {
    return glutenFree;
  }

  public void setGlutenFree(boolean glutenFree) {
    this.glutenFree = glutenFree;
  }

  public boolean isVegan() {
    return vegan;
  }

  public void setVegan(boolean vegan) {
    this.vegan = vegan;
  }

  @Override
  public String toString() {
    return "Order{" +
        "orderNumber=" + orderNumber +
        ", userName='" + userName + '\'' +
        ", itemName='" + itemName + '\'' +
        ", quantity=" + quantity +
        ", glutenFree=" + glutenFree +
        ", vegan=" + vegan +
        '}';
  }
}
