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
        this.dateTime = "Order Unconfirmed Date/Time Unavailable";
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
    
    // This handles all possible non-generated information for the constructor.
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList, AddressInfo shippingAddress, AddressInfo billingAddress, String cardNumber) {
        // To-Do: Validation
        this(user, productList, quantityList, shippingAddress, cardNumber);
        
        this.billingAddress = billingAddress;
    }
    
    public OrderInfo(UserInfo user, ArrayList<ProductInfo> productList, int[] quantityList, AddressInfo shippingAddress, AddressInfo billingAddress, statusEnum orderStatus, String dateTime, double subtotal, String cardNumber) {
        // To-Do: Validation
        this(user, productList, quantityList, shippingAddress, billingAddress, cardNumber);
        
        this.orderStatus = orderStatus;
        this.dateTime = dateTime;
        this.subtotal = subtotal;
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
            output += productList.get(index).toCustomTwo() + ";";
        }
        output += productList.get(productList.size() - 1).toCustomTwo() + ",";
        
        for(index = 0; index < this.quantityList.length - 1; index++) {
            output += Integer.toString(quantityList[index]) + ";";
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
            output += productList.get(index).toCSV() + ";";
        }
        output += productList.get(productList.size() - 1).toCSV() + "\n";
        
        for(index = 0; index < this.quantityList.length - 1; index++) {
            output += Integer.toString(quantityList[index]) + ";";
        }
        output += Integer.toString(quantityList[quantityList.length - 1]) + "\n";
        
        output += this.shippingAddress.toCustom() + "\n";
        output += this.billingAddress.toCustom() + "\n";
        output += "Order Status: " + this.orderStatus.toString() + "\n";
        output += "DateTime: " + this.dateTime + "\n";
        output += "Subtotal: " + this.subtotal + "\n";
        output += "Card Number: " + this.cardNumber;
        
        return(output);
    }
    
    public static OrderInfo fromCSV(String input) {
        OrderInfo output = null;
        UserInfo user = null;
        ArrayList<ProductInfo> productList = new ArrayList<ProductInfo>();
        int[] quantityList = new int[0];
        AddressInfo shippingAddress = null;
        AddressInfo billingAddress = null;
        statusEnum orderStatus = null;
        String dateTime = "";
        double subtotal = -1;
        String cardNumber = "";
        String[] chunks;
        String[] products;
        String[] quantities;
        int index;
        int indexTwo;
        String userS = "";
        String shippingAddressS = "";
        String billingAddressS = "";
        
        chunks = input.split(",");
        
        if(chunks.length == 27) {
            for(index = 0; index < 27; index++) {
                if(index < 12) {                        
                    // Constructing UserInfo instance
                    userS += chunks[index] + ",";
                } else if(index < 13) {
                    userS += chunks[index];
                    user = UserInfo.fromCSV(userS);
                } else if(index < 14) {                 
                    // Constructing ArrayList<ProductInfo>
                    products = chunks[index].split(";");
                    // Going through each product in toCustom form and adding it
                    // to the product list.
                    for(indexTwo = 0; indexTwo < products.length; indexTwo++) {
                        System.out.println(products[indexTwo]);
                        productList.add(ProductInfo.fromCustomTwo(products[indexTwo]));
                    }
                } else if(index < 15) {
                    // Constructing int[] quantityList
                    quantities = chunks[index].split(";");
                    // Similar idea to the product list above.
                    for(indexTwo = 0; indexTwo < quantities.length; indexTwo++) {
                        quantityList = appendIntList(quantityList, Integer.valueOf(quantities[indexTwo]));
                    }
                } else if(index < 18) {
                    // Constructing shiping address.
                    shippingAddressS += chunks[index] + ",";
                } else if(index < 19) {
                    shippingAddressS += chunks[index];
                    shippingAddress = AddressInfo.fromCSV(shippingAddressS);
                } else if(index < 22) {
                    // Constructing shiping address.
                    billingAddressS += chunks[index] + ",";
                } else if(index < 23) {
                    billingAddressS += chunks[index];
                    billingAddress = AddressInfo.fromCSV(billingAddressS);
                } else if(index < 24) {
                    orderStatus = stringToStatus(chunks[index]);
                } else if(index < 25) {
                    dateTime = chunks[index];
                } else if(index < 26) {
                    subtotal = Double.valueOf(chunks[index]);
                } else if(index < 27) {
                    cardNumber = chunks[index];
                } else {
                    System.out.println("In OrderInfo.fromCSV -- Warning: Index bounds exceed expected value!");
                }
                output = new OrderInfo(user, productList, quantityList, shippingAddress, billingAddress, orderStatus, dateTime, subtotal, cardNumber);
            }
        } else {
            System.out.println("In OrderInfo.fromCSV -- Warning: Unsupported order format!");
        }
        
        
        return(output);
    }
    
    public static OrderInfo fromCustom(String input) {
        OrderInfo output = null;
        UserInfo user = null;
        ArrayList<ProductInfo> productList = new ArrayList<ProductInfo>();
        int[] quantityList = new int[0];
        AddressInfo shippingAddress = null;
        AddressInfo billingAddress = null;
        statusEnum orderStatus = null;
        String dateTime = "";
        double subtotal = -1;
        String cardNumber = "";
        String[] lines;
        String[] chunks;
        String[] products;
        String[] quantities;
        int index;
        int indexTwo;
        String userS = "";
        String shippingAddressS = "";
        String billingAddressS = "";
        
        lines = input.split("\n");
        
        if(lines.length == 27) {
            for(index = 0; index < 27; index++) {
                if(index < 12) {                        
                    // Constructing UserInfo instance
                    userS += lines[index] + "\n";
                } else if(index < 13) {
                    userS += lines[index];
                    user = UserInfo.fromCustom(userS);
                } else if(index < 14) {                 
                    // Constructing ArrayList<ProductInfo>
                    products = lines[index].split(";");
                    // Going through each product in toCustom form and adding it
                    // to the product list.
                    for(indexTwo = 0; indexTwo < products.length; indexTwo++) {
                        productList.add(ProductInfo.fromCSV(products[indexTwo]));
                    }
                } else if(index < 15) {
                    // Constructing int[] quantityList
                    quantities = lines[index].split(";");
                    // Similar idea to the product list above.
                    for(indexTwo = 0; indexTwo < quantities.length; indexTwo++) {
                        quantityList = appendIntList(quantityList, Integer.valueOf(quantities[indexTwo]));
                    }
                } else if(index < 18) {
                    // Constructing shiping address.
                    chunks = lines[index].split(": ");
                    shippingAddressS += chunks[1] + ",";
                } else if(index < 19) {
                    chunks = lines[index].split(": ");
                    shippingAddressS += chunks[1];
                    shippingAddress = AddressInfo.fromCSV(shippingAddressS);
                } else if(index < 22) {
                    // Constructing shiping address.
                    chunks = lines[index].split(": ");
                    billingAddressS += chunks[1] + ",";
                } else if(index < 23) {
                    chunks = lines[index].split(": ");
                    billingAddressS += chunks[1];
                    billingAddress = AddressInfo.fromCSV(billingAddressS);
                } else if(index < 24) {
                    chunks = lines[index].split(": ");
                    orderStatus = stringToStatus(chunks[1]);
                } else if(index < 25) {
                    chunks = lines[index].split(": ");
                    dateTime = chunks[1];
                } else if(index < 26) {
                    chunks = lines[index].split(": ");
                    subtotal = Double.valueOf(chunks[1]);
                } else if(index < 27) {
                    chunks = lines[index].split(": ");
                    cardNumber = chunks[1];
                } else {
                    System.out.println("In OrderInfo.fromCSV -- Warning: Index bounds exceed expected value!");
                }
                output = new OrderInfo(user, productList, quantityList, shippingAddress, billingAddress, orderStatus, dateTime, subtotal, cardNumber);
            }
        } else {
            System.out.println("In OrderInfo.fromCSV -- Warning: Unsupported order format!");
        }
        
        
        return(output);
    }
    
    
    
    
    
    
    /*
    
                Helper Functions
    
    */
    
    public static int[] appendIntList(int[] oldIntList, int addingInt) {
        
        /*
        
        This is solely a helper function to append a new integer to an integer list.
        It is chiefly used in the searchCustomerInfo function, and assists with being able
        to return an array of integers.
        
        */
        
        int newIntList[] = Arrays.copyOf(oldIntList, oldIntList.length + 1);
        
        newIntList[newIntList.length - 1] = addingInt;
        
        return (newIntList);
    }
    
    // This is just a helper function to take a string input and turn it
    // into the associated status enum.
    public static statusEnum stringToStatus(String input) {
        statusEnum status;
        
        if(input.equalsIgnoreCase("unordered") == true) {
            status = statusEnum.unordered;
        } else if(input.equalsIgnoreCase("ordered") == true) {
            status = statusEnum.ordered;
        } else if(input.equalsIgnoreCase("shipped") == true) {
            status = statusEnum.shipped;
        } else {
            System.out.println("In OrderInfo.stringToStatus -- Warning: Unsupported status name!");
            status = null;
        }
        
        return(status);
    }
}

enum statusEnum {
    unordered, 
    ordered, 
    shipped
}
