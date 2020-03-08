package com.codurance.badcodeclub;

public class Main {

  public static void main(String[] args) {
    System.out.println(printReceipt("John Doe") + " Company Logo");
  }

  public static String printReceipt(String customer){
    Customer customer1 = Database.fetch(customer);

    int totalOwed = customer1.getTotalOwed(customer1.name);

    return customer1.name + " owes: " + totalOwed;
  }
}
