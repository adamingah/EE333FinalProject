/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args[0].equalsIgnoreCase("/beta") == true) {
            UserInfo userA = new UserInfo("Tip", "Password1");
//            System.out.println(userA.toCSV());
//            System.out.println();
//            System.out.println(userA.toCustom());
//            System.out.println();
//            
            AddressInfo addressB1 = new AddressInfo("3011 Massey Road", "Vestavia Hills", "Alabama", "35216");
            AddressInfo addressB2 = new AddressInfo("6701 Dickens Ferry Road", "Mobile", "Alabama", "36608");
            UserInfo userB = new UserInfo("CoolGuy123", "Password2", "coolguy@gmail.com", addressB1, addressB2);
//            System.out.println(userB.toCSV());
//            System.out.println();
//            String tempString = userB.toCustom();
//            System.out.println(tempString);
//            System.out.println();
//            System.out.println();
//            
//            UserInfo userC;
//            userC = UserInfo.fromCustom(tempString);
//            System.out.println(userC.toCSV());

            ProductInfo productA = new ProductInfo("ID001", "Myers Electronics", true, 18.99, 660);
            ProductInfo productB = new ProductInfo("ID002", "Ramos Electronics", true, 15.00, 500);
            ProductInfo productC = new ProductInfo("ID003", "Yarbrough Electronics", true, 100.00, 10);
            
//            System.out.println(productA.toCSV());
//            System.out.println(productB.toCustom());
//            System.out.println();
//            System.out.println();
//            
//            ProductInfo productD = ProductInfo.fromCSV(productC.toCSV());
//            System.out.println(productD.toCustom());
//            System.out.println();
//            System.out.println();
            
            ArrayList<ProductInfo> productListA = new ArrayList<ProductInfo>();
            productListA.add(productA);
            productListA.add(productB);
            productListA.add(productC);
            int[] quantityListA = new int[]{15, 3, 61};
            OrderInfo orderA = new OrderInfo(userB, productListA, quantityListA, addressB1, addressB2, statusEnum.ordered, "12:05:23:6:45:21", 736.5, "123456");
            
//            System.out.println(orderA.toCSV());
//            System.out.println();
//            System.out.println(orderA.toCustom());
//            System.out.println();
            
            OrderInfo orderB = OrderInfo.fromCSV(orderA.toCSV());
            System.out.println(orderB.toCustom());
        } else {
            
        }
    }
    
}
