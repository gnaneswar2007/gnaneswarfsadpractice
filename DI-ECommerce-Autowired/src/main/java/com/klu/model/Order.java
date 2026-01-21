package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
     private int orderId;
     private String customerName;
     private int quantity;
     
     @Autowired
     private Product product;
     public Order() {
    	 this.orderId=2007;
    	 this.customerName="Gnaneswar";
    	 this.quantity=4;
     }
      public void display() {
    	  System.out.println("The following are the order details of the customer");
    	  System.out.println("OrderId: " + orderId);
    	  System.out.println("customerName: " + customerName);
    	  System.out.println("quantity: " + quantity);
    	  System.out.println("productId: " + product.getProductId());
    	  System.out.println("productName: " + product.getProductName());
    	  System.out.println("ProductPrice: " + product.getPrice());
    	  System.out.println("ProductCategory " + product.getCategory());
      }
}
