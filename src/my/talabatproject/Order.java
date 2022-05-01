/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.talabatproject;

/**
 *
 * @author yasmi
 */


public class Order {
static private String currentDate;
    public static int id = 0;
    public Meal[] meals;
    Order orders[];
    private static int numOfOrders = 0; //total orders for each customer
    public String additionalNotes;
    Customer customer;
     public double totalPrice = 0;
    static int numberOfOrders;
    
    public Order() {
    }
    public Order(Order[] orders) {
        this.orders = orders;
    }
    public Order(Customer customer) {
        this.customer = customer;
        numOfOrders++;
    }
   
    public Order(Meal[] meals, String additionalNotes) {
        this.meals = meals;
        this.additionalNotes = additionalNotes;
    }

    public static String currentOrderDate() {
        currentDate = my.talabatproject.Db.currentDateOfOrder();
        return currentDate;
    }
      public static int orderNumber()
      {
          return my.talabatproject.Db.orderNumber();
      }
}
