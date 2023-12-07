/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OMS;

import PMS.*;
import UMS.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author jmyer
 */
public class FileIO {
    public static ArrayList<ProductInfo> productList = new ArrayList<>();
    public static ArrayList<OrderInfo> orderList = new ArrayList<>();
    public static ArrayList<UserInfo> userList = new ArrayList<>();
    
    public static boolean importAll() {
        boolean didWork = false;
        
        
        
        return(didWork);
    }
    
    public static ArrayList<ProductInfo> importProducts() {
        ArrayList<ProductInfo> productList = new ArrayList<>();
        File importFile;
        FileReader importFileReader;
        BufferedReader importBufferedReader;
        ProductInfo currentProduct;
        String line;
        String fileName = "productRepository.csv";
        
        importFile = new File(fileName);
        if(importFile.exists() == true) {
            try {
                importFileReader = new java.io.FileReader(importFile);
                importBufferedReader = new java.io.BufferedReader(importFileReader);
                
                while((line = importBufferedReader.readLine()) != null) {
                    try {
                        currentProduct = ProductInfo.fromCSV(line);
                        productList.add(currentProduct);
                    } catch(Exception ex) {
                        System.out.println(ex.toString());
                    }
                }
                
                importBufferedReader.close();
                importFileReader.close();
            } catch(java.io.IOException ioEx) {
                System.out.println(ioEx.toString());
            }
        }
        
        return(productList);
    }
    
    public static ArrayList<UserInfo> importUsers() {
        ArrayList<UserInfo> userList = new ArrayList<>();
        File importFile;
        FileReader importFileReader;
        BufferedReader importBufferedReader;
        UserInfo currentUser;
        String line;
        String fileName = "userRepository.csv";
        
        importFile = new File(fileName);
        if(importFile.exists() == true) {
            try {
                importFileReader = new java.io.FileReader(importFile);
                importBufferedReader = new java.io.BufferedReader(importFileReader);
                
                while((line = importBufferedReader.readLine()) != null) {
                    try {
                        currentUser = UserInfo.fromCSV(line);
                        userList.add(currentUser);
                    } catch(Exception ex) {
                        System.out.println(ex.toString());
                    }
                }
                
                importBufferedReader.close();
                importFileReader.close();
            } catch(java.io.IOException ioEx) {
                System.out.println(ioEx.toString());
            }
        }
        
        return(userList);
    }
    
    public static ArrayList<OrderInfo> importOrders() {
        ArrayList<OrderInfo> orderList = new ArrayList<>();
        File importFile;
        FileReader importFileReader;
        BufferedReader importBufferedReader;
        OrderInfo orderProduct;
        String line;
        String fileName = "orderRepository.csv";
        
        importFile = new File(fileName);
        if(importFile.exists() == true) {
            try {
                importFileReader = new java.io.FileReader(importFile);
                importBufferedReader = new java.io.BufferedReader(importFileReader);
                
                while((line = importBufferedReader.readLine()) != null) {
                    try {
                        orderProduct = OrderInfo.fromCSV(line);
                        orderList.add(orderProduct);
                    } catch(Exception ex) {
                        System.out.println(ex.toString());
                    }
                }
                
                importBufferedReader.close();
                importFileReader.close();
            } catch(java.io.IOException ioEx) {
                System.out.println(ioEx.toString());
            }
        }
        
        return(orderList);
    }
    
    public static boolean exportAll() {
        boolean didWork = false;
        
        return(didWork);
    }
    
    public static boolean exportProducts(ArrayList<ProductInfo> productList) {
        boolean didWork = false;
        java.io.File exportFile;
        java.io.FileWriter exportFileWriter;
        
        try {
            exportFile = new java.io.File("productRepository.csv");
            exportFileWriter = new java.io.FileWriter(exportFile);
            
            for(int index = 0; index < productList.size(); index++) {
                exportFileWriter.write(productList.get(index).toCSV() + "\n");
            }
            
            exportFileWriter.close();
            
        } catch(Exception ex) {
            System.out.println("Error: Exception thrown.");
            System.out.println(ex.toString());
            
        }
        
        return(didWork);
    }
    
    public static boolean exportUsers(ArrayList<UserInfo> userList) {
        boolean didWork = false;
        java.io.File exportFile;
        java.io.FileWriter exportFileWriter;
        
        try {
            exportFile = new java.io.File("userRepository.csv");
            exportFileWriter = new java.io.FileWriter(exportFile);
            
            for(int index = 0; index < userList.size(); index++) {
                exportFileWriter.write(userList.get(index).toCSV() + "\n");
            }
            
            exportFileWriter.close();
            
        } catch(Exception ex) {
            System.out.println("Error: Exception thrown.");
            System.out.println(ex.toString());
            
        }
        
        return(didWork);
    }
    
    public static boolean exportOrders(ArrayList<OrderInfo> orderList) {
        boolean didWork = false;
        java.io.File exportFile;
        java.io.FileWriter exportFileWriter;
        
        try {
            exportFile = new java.io.File("orderRepository.csv");
            exportFileWriter = new java.io.FileWriter(exportFile);
            
            for(int index = 0; index < orderList.size(); index++) {
                exportFileWriter.write(orderList.get(index).toCSV() + "\n");
            }
            
            exportFileWriter.close();
            
        } catch(Exception ex) {
            System.out.println("Error: Exception thrown.");
            System.out.println(ex.toString());
            
        }
        
        return(didWork);
    }
}