package com.codurance.badcodeclub;
import java.util.ArrayList;

public class Database {
  private final static String DATABASE_CONNECTION = "DATABASE CONNECTION";

  public static Customer fetch(String customerName){

    int shoeSize = 14;
    int dayOfBirth = 10;
    int monthOfBirth = 10;
    int yearOfBirth = 99;
    return new Customer(customerName, shoeSize, new DateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth));
  }

  public static ArrayList<Product> fetchProduct(Customer customer){
    return new ArrayList<Product>();
  }

  public static ArrayList<Service> fetchService(Customer customer){
    return new ArrayList<Service>();
  }
}
