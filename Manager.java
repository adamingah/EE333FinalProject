/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OMS;

import UMS.AddressInfo;
import UMS.UserInfo;

/**
 *
 * @author jmyer
 */
public class Manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args[0].equalsIgnoreCase("/beta") == true) {
            UserInfo userA = new UserInfo("Tip", "Password1");
            System.out.println(userA.toCSV());
            System.out.println();
            System.out.println(userA.toCustom());
            System.out.println();
            
            AddressInfo addressB1 = new AddressInfo("3011 Massey Road", "Vestavia Hills", "Alabama", "35216");
            AddressInfo addressB2 = new AddressInfo("6701 Dickens Ferry Road", "Mobile", "Alabama", "36608");
            UserInfo userB = new UserInfo("CoolGuy123", "Password2", "coolguy@gmail.com", addressB1, addressB2);
            System.out.println(userB.toCSV());
            System.out.println();
            String tempString = userB.toCustom();
            System.out.println(tempString);
            System.out.println();
            System.out.println();
            
            UserInfo userC;
            userC = UserInfo.fromCustom(tempString);
            System.out.println(userC.toCSV());
            
            
        } else {
            
        }
    }
    
}
