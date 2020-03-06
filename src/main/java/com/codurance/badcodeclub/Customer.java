package com.codurance.badcodeclub;

public class Customer {
  private final static String DATABASE_CONNECTION = "DATABASE CONNECTION";

  public String name;
  private int shoeSize;
  private int age;
  private DateOfBirth dateOfBirth;



  public Customer(String customerName, int shoeSize, DateOfBirth dateOfBirth) {
    this.name = customerName;
    this.shoeSize = shoeSize;
    this.dateOfBirth = dateOfBirth;
  }

  public int getTotalOwed(String customerName){
    int total = 0;
    total += getTotalProductPrice(customerName);
    total += getTotalServicePrice(customerName);
    return total;
  }


  private int getTotalProductPrice(String customerName) {
    int productTotal = 0;
    for(Product product : Database.fetchProduct(this)) {
      productTotal += product.getPrice();
    }
    return productTotal;
  }

  private int getTotalServicePrice(String customerName) {
    int serviceTotal = 0;
    for(Service service : Database.fetchService(this)) {
      serviceTotal += service.getPrice();
    }
    return serviceTotal;
  }
}
