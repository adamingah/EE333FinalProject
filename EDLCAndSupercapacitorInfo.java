/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

/**
 *
 * @author jmyer
 */
public final class EDLCAndSupercapacitorInfo extends CapacitorInfo {
    public EDLCAndSupercapacitorInfo() {
        super();
    }
    
     public EDLCAndSupercapacitorInfo(String manufacturer, boolean availability, double price, int quantity, double capacitance, int capacitancePrefix, int tolerancePlue, int toleranceMinus, double voltage) {
         super(manufacturer, availability, price, quantity, capacitance, capacitancePrefix, tolerancePlue, toleranceMinus, voltage);
     }
     
//     public String toCSV() {
//         String output = "";
//         
//     }
//     
//     public String toCustomTwo() {
//         
//     }
//     
//     public EDLCAndSupercapacitorInfo fromCSV() {
//         
//     }
//     
//     public EDLCAndSupercapacitorInfo fromCustomTwo() {
//         
//     }
}
