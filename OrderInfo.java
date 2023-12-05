/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OMS;

import PMS.ProductInfo;
import UMS.AddressInfo;
import UMS.UserInfo;
import java.util.*;

/**
 *
 * @author jmyer
 */
public class OrderInfo {
    private UserInfo user;
    private ArrayList<ProductInfo> productList;
    private int[] quantityList;
    private AddressInfo shippingAddress;
    private AddressInfo billingAddress;
    private statusEnum orderStatus;                 // Generated upon order initialization
    private String dateTime;                        // Generated upon order confirmation
    private double subtotal;                        // Generated upon order confirmation
    private String cardNumber;
    
    
    
    
    /*
    
                Constructors
    
    */
    
    // This is the base OrderInfo constructor.
    private OrderInfo() {
        this.orderStatus = statusEnum.unordered;
        this.dateTime = "Order Unconfirmed, Date/Time Unavailable";
        this.subtotal = -1;
    }
    
    // This is minimum amount of information to create an order. All additional info
    // will be gathered later in the UI.
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList) {
        // To-Do: Validation
        this();
        
        this.user = user;
        this.quantityList = quantityList;
        this.productList = productList;
    }
    
    // This handles the minimum amount of information and one address. The one address will be
    // used as both the shipping and billing address.
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList, AddressInfo address) {
        // To-Do: Validation
        this(user, productList, quantityList);
        
        shippingAddress = address;
        billingAddress = address;
    }
    
    // This handles the same information as the constructor above but with both
    // the shipping address and billing address provided.
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList, AddressInfo shippingAddress, AddressInfo billingAddress) {
        // To-Do: Validation
        this(user, productList, quantityList, shippingAddress);
        
        this.billingAddress = billingAddress;
    }
    
    // This handles the minimum amount of information as well as a card number.
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList, String cardNumber) {
        // To-Do: Validation
        this(user, productList, quantityList);
        
        this.cardNumber = cardNumber;
    }
    
    // This handles the base info, a card number, and one address that is used as both
    // shipping and billing.
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList, AddressInfo address, String cardNumber) {
        // To-Do: Validation
        this(user, productList, quantityList, address);
        
        this.cardNumber = cardNumber;
    }
    
    // This handles all possible information for the constructor.
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList, AddressInfo shippingAddress, AddressInfo billingAddress, String cardNumber) {
        this(user, productList, quantityList, shippingAddress, cardNumber);
        
        this.billingAddress = billingAddress;
    }
    
    
    
    
    
    /*
    
                Getters/Setters
    
    */

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        // To-Do: Validation
        this.user = user;
    }

    public ArrayList<ProductInfo> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<ProductInfo> productList) {
        // To-Do: Validation
        this.productList = productList;
    }

    public int[] getQuantityList() {
        return quantityList;
    }

    public void setQuantityList(int[] quantityList) {
        // To-Do: Validation
        this.quantityList = quantityList;
    }

    public AddressInfo getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(AddressInfo shippingAddress) {
        // To-Do: Validation
        this.shippingAddress = shippingAddress;
    }

    public AddressInfo getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(AddressInfo billingAddress) {
        // To-Do: Validation
        this.billingAddress = billingAddress;
    }

    public statusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(statusEnum orderStatus) {
        // To-Do: Validation
        this.orderStatus = orderStatus;
    }

    public String getDateTime() {
        return dateTime;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        // To-Do: Validation
        this.subtotal = subtotal;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        // To-Do: Validation
        this.cardNumber = cardNumber;
    }
    
    
    
    
    
    
    /*
    
                To/From Functions
    
    */
    
    public String toCSV() {
        int index = 0;
        String output = "";
        
        output += this.user.toCSV() + ",";
        
        for(index = 0; index < this.productList.size() - 1; index++) {
            output += productList.get(index).toCustom() + "|";
        }
        output += productList.get(productList.size() - 1).toCustom() + ",";
        
        for(index = 0; index < this.quantityList.length - 1; index++) {
            output += Integer.toString(quantityList[index]) + "|";
        }
        output += Integer.toString(quantityList[quantityList.length - 1]) + ",";
        
        output += this.shippingAddress.toCSV() + ",";
        output += this.billingAddress.toCSV() + ",";
        output += this.orderStatus.toString() + ",";
        output += this.dateTime + ",";
        output += this.subtotal + ",";
        output += this.cardNumber;
        
        return(output);
    }
    
    public String toCustom() {
        int index = 0;
        String output = "";
        
        output += this.user.toCustom() + "\n";
        
        for(index = 0; index < this.productList.size() - 1; index++) {
            output += productList.get(index).toCSV() + "|";
        }
        output += productList.get(productList.size() - 1).toCSV() + ",";
        
        for(index = 0; index < this.quantityList.length - 1; index++) {
            output += Integer.toString(quantityList[index]) + "|";
        }
        output += Integer.toString(quantityList[quantityList.length - 1]) + ",";
        
        output += this.shippingAddress.toCSV() + ",";
        output += this.billingAddress.toCSV() + ",";
        output += "Order Status: " + this.orderStatus.toString() + "\n";
        output += "DateTime: " + this.dateTime + "\n";
        output += "Subtotal: " + this.subtotal + "\n";
        output += "Card Number: " + this.cardNumber;
        
        return(output);
    }
}

enum statusEnum {
    unordered, 
    ordered, 
    shipped
}
