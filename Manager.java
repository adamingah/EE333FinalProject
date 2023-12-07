/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OMS;

import PMS.ProductInfo;
import PMS.CapacitorInfo;
import PMS.EDLCAndSupercapacitorInfo;
import PMS.MicaAndPTFEInfo;
import PMS.NetworksAndArraysInfo;
import PMS.TrimmerAndVariableInfo;
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
//            UserInfo userA = new UserInfo("Tip", "Password1");
//            System.out.println(userA.toCSV());
//            System.out.println();
//            System.out.println(userA.toCustom());
//            System.out.println();
//            
//            AddressInfo addressB1 = new AddressInfo("3011 Massey Road", "Vestavia Hills", "Alabama", "35216");
//            AddressInfo addressB2 = new AddressInfo("6701 Dickens Ferry Road", "Mobile", "Alabama", "36608");
//            UserInfo userB = new UserInfo("CoolGuy123", "Password2", "coolguy@gmail.com", addressB1, addressB2);
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

//            ProductInfo productA = new ProductInfo("ID001", "Myers Electronics", true, 18.99, 660);
//            ProductInfo productB = new ProductInfo("ID002", "Ramos Electronics", true, 15.00, 500);
//            ProductInfo productC = new ProductInfo("ID003", "Yarbrough Electronics", true, 100.00, 10);
            
//            System.out.println(productA.toCSV());
//            System.out.println(productB.toCustom());
//            System.out.println();
//            System.out.println();
//            
//            ProductInfo productD = ProductInfo.fromCSV(productC.toCSV());
//            System.out.println(productD.toCustom());
//            System.out.println();
//            System.out.println();
            
//            ArrayList<ProductInfo> productListA = new ArrayList<ProductInfo>();
//            productListA.add(productA);
//            productListA.add(productB);
//            productListA.add(productC);
//            int[] quantityListA = new int[]{15, 3, 61};
//            OrderInfo orderA = new OrderInfo(userB, productListA, quantityListA, addressB1, addressB2, statusEnum.ordered, "12:05:23:6:45:21", 736.5, "123456");
            
//            System.out.println(orderA.toCSV());
//            System.out.println();
//            System.out.println(orderA.toCustom());
//            System.out.println();
            
//            OrderInfo orderB = OrderInfo.fromCSV(orderA.toCSV());
//            System.out.println(orderB.toCustom());
            
//            SettingsInfo settingsA = new SettingsInfo("ProductRepository.csv", "UserRepository.csv", "OrderRepository.csv", "csv");
//            settingsA.setSettingsInfo();
//            
//            SettingsInfo settingsB = SettingsInfo.getSettingsInfo();
//            System.out.println();
//            System.out.println(settingsB.toXML());

//            FileIO.exportProducts(productListA);
//            ArrayList<ProductInfo> productListB = FileIO.importProducts();
//            for(int index = 0; index < productListB.size(); index++) {
//                System.out.println(productListB.get(index).toCustom());
//            }
            
//            ArrayList<UserInfo> userListA = new ArrayList<>();
//            userListA.add(userA);
//            userListA.add(userB);
//            FileIO.exportUsers(userListA);
//            ArrayList<UserInfo> userListB = FileIO.importUsers();
//            System.out.println(userListB.size());
//            System.out.println(userListB.get(1).toCSV());
            
//            ArrayList<OrderInfo> orderListA = new ArrayList<>();
//            OrderInfo orderC = new OrderInfo(userA, productListA, quantityListA, addressB1, addressB2, statusEnum.ordered, "Hi this is a test", 736.5, "1892");
//            orderListA.add(orderA);
//            orderListA.add(orderB);
//            FileIO.exportOrders(orderListA);
//            ArrayList<OrderInfo> orderListB = FileIO.importOrders();
//            for(int index = 0; index < orderListB.size(); index++) {
//                System.out.println();
//                System.out.println();
//                System.out.println(orderListB.get(index).toCustom());
//            }


            ProductInfo productD = new ProductInfo("ID003", "Myers Electronics", true, 15, 199999);
//            System.out.println(productD.toString());
//            
//            ProductInfo productE = new EDLCAndSupercapacitorInfo("Ramos Electornics", true, 16, 1222, 44, -9, 15, 15, 30);
//            System.out.println(productE.toString());













            AddressInfo addressA = new AddressInfo("1234 Main Street", "Paris", "Texas", "44556");
            AddressInfo addressB = AddressInfo.fromCustomTwo(addressA.toCustomTwo());
//            System.out.println(addressB.toCustom());
            
            UserInfo userD = new UserInfo("Tip", "CoolGuy123", "coolguy123@gmail.com", addressA, addressB);
            UserInfo userE = UserInfo.fromCSV(userD.toCSV());
//            System.out.println(userE.toCSV());
            
            ProductInfo productF = new ProductInfo("ID004", "Yarbrough Electronics", true, 15, 1166);
            ArrayList<ProductInfo> productListB = new ArrayList<>();
            productListB.add(productD);
            productListB.add(productF);
            int[] quantityListC = new int[]{12, 22};
            
            OrderInfo orderD = new OrderInfo(userE, productListB, quantityListC, addressA, addressB, statusEnum.ordered, "12:12:12:12:12", 15, "123532498");
            OrderInfo orderE = OrderInfo.fromCSV(orderD.toCSV());
            System.out.println();
            System.out.println();
            System.out.println(orderE.toCSV());
            
            ArrayList<OrderInfo> orderListB = new ArrayList<>();
            orderListB.add(orderD);
            orderListB.add(orderE);
            
            ArrayList<UserInfo> userListB = new ArrayList<>();
            userListB.add(userD);
            userListB.add(userE);
            
            FileIO.exportOrders(orderListB);
            FileIO.exportProducts(productListB);
            FileIO.exportUsers(userListB);
            
        } else {
            
        }
    }
    
}
