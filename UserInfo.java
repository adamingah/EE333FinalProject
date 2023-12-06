/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMS;

import UMS.AddressInfo.*;

/**
 *
 * @author jmyer
 */
public class UserInfo {
    private userRoleEnum userRole;
    private String ID;
    private String username;
    private String password;
    private String email;
    private AddressInfo shippingAddress;
    private AddressInfo billingAddress;
    
    
    
    /*
    
                Constructors
    
    */
    
    // This is just the base-level UserInfo constructor.
    private UserInfo() {
        this.userRole = userRoleEnum.guest;
        this.ID = "";
        this.username = "";
        this.email = "";
        this.password = "";
        this.shippingAddress = null;
        this.billingAddress = null;
    }
    
    // This is the UserInfo constructor to use if only a username and password
    // are added. Other info (such as the AddressInfo instances), can be altered
    // later when the user wants to. If the user does not log in as a guest
    // this constructor is the base level.
    public UserInfo(String username, String password) {
        // To-Do: Validation
        this();
        
        this.userRole = userRoleEnum.customer;
        this.ID = "To-Do - ID Creation";
        this.username = username;
        this.password = password;
        this.shippingAddress = new AddressInfo("", "", "", "");
        this.billingAddress = new AddressInfo("", "", "", "");
    }
    
    // If customer chooses to include email when creating an account.
    public UserInfo(String username, String password, String email) {
        // To-Do: Validation
        this(username, password);
        
        this.email = email;
    }
    
    // If customer chooses to include an address, an email, 
    // and chooses the address to be the same for both shipping and billing.
    public UserInfo(String username, String password, AddressInfo shippingAddress) {
        // To;Do: Validation
        this(username, password);
        
        this.shippingAddress = shippingAddress;
        this.billingAddress = shippingAddress;
    }
    
    // If customer chooses to include an address, no email, 
    // and chooses the address to be the same for both shipping and billing.
    public UserInfo(String username, String password, String email, AddressInfo shippingAddress) {
        // To;Do: Validation
        this(username, password, email);
        
        this.shippingAddress = shippingAddress;
        this.billingAddress = shippingAddress;
    }
    
    // If customer chooses to include an address, no email, and both addresses.
    public UserInfo(String username, String password, AddressInfo shippingAddress, AddressInfo billingAddress) {
        // To;Do: Validation
        this(username, password);
        
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }
    
    // If customer chooses to include an address, an email, and both addresses.
    public UserInfo(String username, String password, String email, AddressInfo shippingAddress, AddressInfo billingAddress) {
        // To;Do: Validation
        this(username, password, email);
        
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }
    
    public UserInfo(userRoleEnum userRole, String ID, String username, String password, String email, AddressInfo shippingAddress, AddressInfo billingAddress) {
        this(username, password, email, shippingAddress, billingAddress);
        
        this.userRole = userRole;
        this.ID = ID;
    }
    
    
    
    
    
    /*
    
                Getters and Setters
    
    */

    public userRoleEnum getUserRole() {
        return userRole;
    }

    public String getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        // To-Do: Validation
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // To-Do: Validation
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // To-Do: Validation
        this.password = password;
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
    
    
    
    
    
    /*
    
                To/From Functions
    
    */
    
    public String toString() {
        // To-Do: Figure out what the toString() output should look like.
        String output = "";
        
        return(output);
    }
    
    public String toCSV() {
        String output = "";
        
        output += this.userRole.toString() + ",";
        output += this.ID + ",";
        output += this.username + ",";
        output += this.password + ",";
        output += this.email + ",";
        output += this.shippingAddress.toCSV() + ",";
        output += this.billingAddress.toCSV();
        
        return(output);
    }
    
    public String toCustom() {
        String output = "";
        
        output += "User Role: " + this.userRole.toString() + "\n";
        output += "ID: " + this.ID + "\n";
        output += "Username: " + this.username + "\n";
        output += "Password: " + this.password + "\n";
        output += "Email: " + this.email + "\n";
        output += this.shippingAddress.toCustom() + "\n";
        output += this.billingAddress.toCustom();
        
        return(output);
    }
    
    public static UserInfo fromCSV(String input) {
        UserInfo output = null;
        AddressInfo shippingAddress;
        AddressInfo billingAddress;
        userRoleEnum userRole;
        String shippingAddressS = "";
        String billingAddressS = "";
        String userRoleS = "";
        String ID = "";
        String username = "";
        String password = "";
        String email = "";
        String[] chunks;
        
        if(input == null) {
            System.out.println("In UserInfo.fromCSV -- Input string is null!");
        } else if(input.length() == 0) {
            System.out.println("In UserInfo.fromCSV -- Input string is zero-length!");
        } else {
            chunks = input.split(",");
            
            if(chunks.length == 13) {
                userRoleS = chunks[0];
                ID = chunks[1];
                username = chunks[2];
                password = chunks[3];
                email = chunks[4];
                userRole = stringToUserRoleEnum(userRoleS);
                
                shippingAddressS += chunks[5] + "," + chunks[6] + "," + chunks[7] + "," + chunks[8];
                billingAddressS += chunks[9] + "," + chunks[10] + "," + chunks[11] + "," + chunks[12];
                
                shippingAddress = AddressInfo.fromCSV(shippingAddressS);
                billingAddress = AddressInfo.fromCSV(billingAddressS);
                
                
                
                output = new UserInfo(userRole, ID, username, password, email, shippingAddress, billingAddress);
            }
        }
        
        
        return(output);
    }
    
    public static UserInfo fromCustom(String input) {
        UserInfo output = null;
        AddressInfo shippingAddress = null;
        AddressInfo billingAddress = null;
        userRoleEnum userRole = userRoleEnum.unknown;
        String ID = "";
        String username = "";
        String password = "";
        String email = "";
        String street = "";
        String city = "";
        String state = "";
        String zip = "";
        String[] chunks;
        String[] lines;
        int index = 0;
        
        if(input == null) {
            System.out.println("In UserInfo.fromCSV -- Input string is null!");
        } else if(input.length() == 0) {
            System.out.println("In UserInfo.fromCSV -- Input string is zero-length!");
        } else {
            lines = input.split("\n");
            
            if(lines.length == 13) {
                while(index < lines.length) {
                    chunks = lines[index].split(": ");
                    
                    if(index < 5) {
                        if(chunks[0].equalsIgnoreCase("User Role")) {
                            userRole = stringToUserRoleEnum(chunks[1]);
                        } else if(chunks[0].equalsIgnoreCase("ID")) {
                            ID = chunks[1];
                        } else if(chunks[0].equalsIgnoreCase("Username")) {
                            username = chunks[1];
                        } else if((chunks[0].equalsIgnoreCase("Password"))) {
                            password = chunks[1];
                        } else if(chunks[0].equalsIgnoreCase("Email")) {
                            email = chunks[1];
                        }
                        
                    } else if(index >= 5 && index < 9) {
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
                        shippingAddress = new AddressInfo(street, city, state, zip);
                        
                    } else if(index >= 9) {
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
                        billingAddress = new AddressInfo(street, city, state, zip);
                    }
                    index++;
                }
            }
            
            output = new UserInfo(userRole, ID, username, password, email, shippingAddress, billingAddress);
        }
        
        
        return(output);
    }
    
    
    
    
    /*
    
                Helper Functions
    
    */
    
    private static userRoleEnum stringToUserRoleEnum(String input) {
        userRoleEnum output;
        
        if(input.equalsIgnoreCase("guest")) {
            output = userRoleEnum.guest;
        } else if(input.equalsIgnoreCase("customer")) {
            output = userRoleEnum.customer;
        } else if((input.equalsIgnoreCase("employee"))) {
            output = userRoleEnum.employee;
        } else if(input.equalsIgnoreCase("admin")) {
            output = userRoleEnum.admin;
        } else {
            output = userRoleEnum.unknown;
        }
        
        return(output);
    }
}



enum userRoleEnum {
    guest,
    customer,
    employee,
    admin,
    unknown
}