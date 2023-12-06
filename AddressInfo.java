/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMS;

/**
 *
 * @author jmyer
 */
public class AddressInfo {
    String street;
    String city;
    String state;
    String zip;
    
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
        
        output += this.street + ",";
        output += this.city + ",";
        output += this.state + ",";
        output += this.zip;
        
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
        
        output += "Street: " + this.street + "\n";
        output += "City: " + this.city + "\n";
        output += "State: " + this.state + "\n";
        output += "Zip: " + this.zip;
        
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
}
