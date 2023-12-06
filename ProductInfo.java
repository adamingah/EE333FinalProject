/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

import OMS.OrderInfo;
import UMS.AddressInfo;
import UMS.UserInfo;
import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author jmyer
 */
public class ProductInfo {
    
    private String ID;                      // Generated upon new product creation
    private String manufacturer;
    private boolean availability;
    private double price;
    private int quantity;
    
    
    
    
    
    
    /*
    
                Constructors
    
    */
    
    // This is the initialization constructor. Does not give any useful information.
    // Is protected so that the children of ProductInfo can utilize it, as they
    // are in the same package, but nobody else should be able to use it.
    protected ProductInfo() {
        ID = "";
        manufacturer = "";
        availability = false;
        price = -1;
        quantity = -1;
    }
    
    // This is the full constructor to create an entirely new product, not 
    // used to pull an existing product with an existing ID off of a repository.
    // An ID will be generated with this constructor.
    public ProductInfo(String manufacturer, boolean availability, double price, int quantity) {
        // To-Do: Validation and Generate ID
        this();
        
        this.ID = "ID Generation Unsupported";
        this.manufacturer = manufacturer;
        this.availability = availability;
        this.price = price;
        this.quantity = quantity;
    }
    
    // This is the full constructor for information pulled from an existing
    // repository. IDs are not generated automatically.
    public ProductInfo(String ID, String manufacturer, boolean availability, double price, int quantity) {
        // To-Do: Validation
        this();
        
        this.ID = ID;
        this.manufacturer = manufacturer;
        this.availability = availability;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    
    
    
    
    /*
    
                Getters/Setters
    
    */

    public String getID() {
        return ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        // To-Do: Validation
        this.manufacturer = manufacturer;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        // To-Do: Validation
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // To-Do: Validation
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        // To-Do: Validation
        this.quantity = quantity;
    }
    
    // This is a helper function to add or subtract from the quantity of an item.
    // If there is too few of the item to subtract the desired amount, false is
    // returned from the function.
    //
    // Enter a positive number to add and a negative number to subtract.
    public boolean addSubtractQuantity(int input) {
        boolean didWork = false;
        
        if((this.quantity + input) >= 0) {
            didWork = true;
            this.setQuantity(this.quantity + input);
        } else {
            didWork = false;
        }
        
        return(didWork);
    }
    
    
    
    
    
    
    /*
    
                To/From Functions
    
    */
    
    public String toString() {
        // To-Do: Figure out how to implement.
        String output = "";
        
        return(output);
    }
    
    public String toCSV() {
        String output = "";
        
        output += this.ID + ",";
        output += this.manufacturer + ",";
        output += String.valueOf(this.availability) + ",";
        output += String.valueOf(this.price) + ",";
        output += String.valueOf(this.quantity);
        
        return(output);
    }
    
    public String toCustom() {
        String output = "";
        
        output += "ID: " + this.ID + "\n";
        output += "Manufacturer: " + this.manufacturer + "\n";
        output += "Availability: " + String.valueOf(this.availability) + "\n";
        output += "Price: " + String.valueOf(this.price) + "\n";
        output += "Quantity: " + String.valueOf(this.quantity);
        
        return(output);
    }
    
    public String toCustomTwo() {
        String output = "";
        
        output += "<" + this.ID + ">";
        output += "<" + this.manufacturer + ">";
        output += "<" + String.valueOf(this.availability) + ">";
        output += "<" + String.valueOf(this.price) + ">";
        output += "<" + String.valueOf(this.quantity) + ">";
        
        return(output);
    }
    
    public static ProductInfo fromCSV(String input) {
        ProductInfo output;
        String ID;
        String manufacturer;
        boolean availability;
        double price;
        int quantity;
        String[] chunks;
        
        chunks = input.split(",");
        if(chunks.length == 5) {
            ID = chunks[0];
            manufacturer = chunks[1];
            availability = Boolean.valueOf(chunks[2]);
            price = Double.valueOf(chunks[3]);
            quantity = Integer.valueOf(chunks[4]);
            
            output = new ProductInfo(ID, manufacturer, availability, price, quantity);
        } else {
            output = null;
        }
        
        return(output);
    }
    
    public static ProductInfo fromCustom(String input) {
        ProductInfo output;
        String ID = "";
        String manufacturer = "";
        boolean availability = false;
        double price = -1;
        int quantity = -1;
        String[] chunks;
        String[] lines;
        
        lines = input.split("\n");
        if(lines.length == 5) {
            for(int index = 0; index < lines.length; index++) {
                chunks = lines[index].split(": ");
                
                if(chunks[0].equalsIgnoreCase("ID") == true) {
                    ID = chunks[1];
                } else if(chunks[0].equalsIgnoreCase("Manufacturer") == true) {
                    manufacturer = chunks[1];
                } else if(chunks[0].equalsIgnoreCase("Availability") == true) {
                    availability = Boolean.valueOf(chunks[1]);
                } else if(chunks[0].equalsIgnoreCase("Price") == true) {
                    price = Double.valueOf(chunks[1]);
                } else if(chunks[0].equalsIgnoreCase("Quantity") == true) {
                    quantity = Integer.valueOf(chunks[1]);
                } else {
                    System.out.println("In ProductInfo.fromCustom -- Warning: Unsupported field!");
                }
            }
            
            output = new ProductInfo(ID, manufacturer, availability, price, quantity);
        } else {
            output = null;
        }
        
        return(output);
    }
    
    public static ProductInfo fromCustomTwo(String input) {
        ProductInfo output;
        String ID = "";
        String manufacturer = "";
        boolean availability = false;
        double price = -1;
        int quantity = -1;
        
        Pattern regex = Pattern.compile("<(.*)><(.*)><(.*)><(.*)><(.*)>");
        java.util.regex.Matcher matcher = regex.matcher(input);
        
        if(matcher.find() == true) {
            ID = matcher.group(1);
            manufacturer = matcher.group(2);
            availability = Boolean.valueOf(matcher.group(3));
            price = Double.valueOf(matcher.group(4));
            quantity = Integer.valueOf(matcher.group(5));
        }
        
        output = new ProductInfo(ID, manufacturer, availability, price, quantity);
        
        return(output);
    }
}