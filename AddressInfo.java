/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMS;

import java.util.regex.Pattern;

/**
 *
 * @author jmyer
 */
public class AddressInfo {
    private String street;
    private String city;
    private String state;
    private String zip;
    
    /*
    
                Constructors
    
    */
    
    private AddressInfo() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = "";
    }
    
    public AddressInfo(String street, String city, String state, String zip) {
        // To-Do: Use ValidateAll()
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    /* 
    
                Validation Functions
    
    */
    
    private boolean validateAll(String street, String city, String state, String zip) {
        boolean areValid = false;
        
        if(validateStreet(street) == true &&
           validateCity(city) == true &&
           validateState(state) == true &&
           validateZip(zip) == true) {
            areValid = true;
        }
        
        return(areValid);
    }
    
    private boolean validateStreet(String street) {
        // To-Do: Finish
        boolean isValid = false;
        
        return(isValid);
    }
    
    private boolean validateCity(String city) {
        // To-Do: Finish
        boolean isValid = false;
        
        return(isValid);
    }
    
    private boolean validateState(String state) {
        // To-Do: Finish
        boolean isValid = false;
        
        return(isValid);
    }
    
    private boolean validateZip(String zip) {
        // To-Do: Finish
        boolean isValid = false;
        
        return(isValid);
    }
    
    
    
    
    
    /*
    
                To/From Functions
    
    */
    
    public String toString() {
        // To-Do: Figure out what should go in here.
        String output = "";
        
        return(output);
    }
    
    // Ex: "street,city,state,zip"
    public String toCSV() {
        String output = "";
        
        output += this.getStreet() + ",";
        output += this.getCity() + ",";
        output += this.getState() + ",";
        output += this.getZip();
        
        return(output);
    }
    
    /*
        Ex:
            "Street: <street>
             City: <city>
             State: <state>
             Zip: <zip>"
    */ 
    public String toCustom() {
        String output = "";
        
        output += "Street: " + this.getStreet() + "\n";
        output += "City: " + this.getCity() + "\n";
        output += "State: " + this.getState() + "\n";
        output += "Zip: " + this.getZip();
        
        return(output);
    }
    
    public String toCustomTwo() {
        String output = "";
        
        output += "<" + this.getStreet() + ">";
        output += "<" + this.getCity() + ">";
        output += "<" + this.getState() + ">";
        output += "<" + this.getZip() + ">";
        
        return(output);
    }
    
    // Ex: "street,city,state,zip"
    public static AddressInfo fromCSV(String input) {
        AddressInfo output = null;
        String street = "";
        String city = "";
        String state = "";
        String zip = "";
        String[] chunks;
        
        // To-Do: Validation
        if(input == null) {
            System.out.println("In AddressInfo.fromCSV -- Warning: Input is null!");
        } else if(input.length() == 0) {
            System.out.println("In AddressInfo.fromCSV -- Warning: Input is a zero length string!");
        } else {
            chunks = input.split(",");
        
            if(chunks.length == 4) {
                street = chunks[0];
                city = chunks[1];
                state = chunks[2];
                zip = chunks[3];
            
                output = new AddressInfo(street, city, state, zip);
            }
        }
        
        return(output);
    }
    
    /*
        Ex:
            "Street: <street>
             City: <city>
             State: <state>
             Zip: <zip>"
    */ 
    public static AddressInfo fromCustom(String input) {
        AddressInfo output = null;
        String street = "";
        String city = "";
        String state = "";
        String zip = "";
        String[] chunks;
        String[] lines;
        int index;
        
        if(input == null) {
            System.out.println("In AddressInfo.fromCustom -- Warning: Input is null!");
        } else if(input.length() == 0) {
            System.out.println("In AddressInfo.fromCustom -- Warning: Input is a zero-length string!");
        } else {
            lines = input.split("\n");
            
            for(index = 0; index < lines.length; index++) {
                if(lines.length == 4) {
                    chunks = lines[index].split(": ");
                
                    if(chunks[0].equalsIgnoreCase("Street")) {
                        street = chunks[1];
                    } else if(chunks[0].equalsIgnoreCase("City")) {
                        city = chunks[1];
                    } else if(chunks[0].equalsIgnoreCase("State")) {
                        state = chunks[1];
                    } else if(chunks[0].equalsIgnoreCase("Zip")) {
                        zip = chunks[1];
                    } else {
                        
                    }
                }
            }
            output = new AddressInfo(street, city, state, zip);
        }
        
        return(output);
    }
    
    public static AddressInfo fromCustomTwo(String input) {
        AddressInfo output;
        String street = "";
        String city = "";
        String state = "";
        String zip = "";
        
        Pattern regex = Pattern.compile("<(.*)><(.*)><(.*)><(.*)>");
        java.util.regex.Matcher matcher = regex.matcher(input);
        
        if(matcher.find() == true) {
            street = matcher.group(1);
            city = matcher.group(2);
            state = matcher.group(3);
            zip = matcher.group(4);
        }
        
        output = new AddressInfo(street, city, state, zip);
        
        return(output);
    }
    
    
    
    
    
    
    /*
    
                Getters/Setters
    
    */

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
}
