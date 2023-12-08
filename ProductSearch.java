/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

import java.util.*;

/**
 *
 * @author jmyer
 */
public class ProductSearch {
    public static ArrayList<ProductInfo> searchByID(ArrayList<ProductInfo> productList, String IDToSearch) {
        ArrayList<ProductInfo> searchResults = new ArrayList<>();
        ProductInfo currentProduct;
        int index = 0;
        System.out.println(productList.size());
        
        for(index = 0; index < productList.size(); index++) {
            currentProduct = productList.get(index);
            System.out.println(productList.get(index).toCSV());
            if(currentProduct.getID().equalsIgnoreCase(IDToSearch) == true) {
                System.out.println("SUCCESS");
                searchResults.add(currentProduct);
            }
        }
        
        return(searchResults);
    }
    
    public static ArrayList<ProductInfo> searchByType(ArrayList<ProductInfo> productList, String typeToSearch) {
        ArrayList<ProductInfo> searchResults = new ArrayList<>();
        ProductInfo currentProduct;
        String chunks[];
        int index = 0;
        
        for(index = 0; index < productList.size(); index++) {
            currentProduct = productList.get(index);
            chunks = currentProduct.toString().split("@");
            if(currentProduct.getID().equalsIgnoreCase(typeToSearch) == true) {
                searchResults.add(currentProduct);
            }
        }
        
        return(searchResults);
    }
}
