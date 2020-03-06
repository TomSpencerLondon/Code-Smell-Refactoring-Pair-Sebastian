import jdk.vm.ci.services.Services;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println(printReceipt("John Doe") + " Company Logo");
  }

  // Long method
  // Customer
  // How much the customer owes
  // Company logo

  private final static String DATABASE_CONNECTION = "DATABASE CONNECTION";
  public static String printReceipt(String customer){
    Customer customer = Database.fetchData(DATABASE_CONNECTION, customer);

    ArrayList<Products> products = customer.getProducts();

    int totalOwed = 0;

    for(product : products){
      totalOwed += product.price();
    }

    ArrayList<Services> services = customer.getServices();

    for(service : services){
      totalOwed += service.price();
    }

    return "" +
            customer.name +
            customer.lastName +
            " owes: " +
            totalOwed;
  }
}
