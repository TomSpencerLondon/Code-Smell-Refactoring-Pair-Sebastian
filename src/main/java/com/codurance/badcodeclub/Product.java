package com.codurance.badcodeclub;

public class Product extends Stock {

  private int quantity;

  public Product(int price, int quantity){
    super(price);
    this.quantity = quantity;
  }
}
