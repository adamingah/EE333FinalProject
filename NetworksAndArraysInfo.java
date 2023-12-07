/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

/**
 *
 * @author jmyer
 */
public final class NetworksAndArraysInfo extends CapacitorInfo {
    int numCapacitors;
    String circuitType;
    
    public NetworksAndArraysInfo() {
        super();
        
        this.numCapacitors = -1;
        this.circuitType = "";
    }
    
    public NetworksAndArraysInfo(String manufacturer, boolean availability, double price, int quantity, double capacitance, int capacitancePrefix, int tolerancePlue, int toleranceMinus, double voltage, int numCapacitors, String circuitType) {
        super(manufacturer, availability, price, quantity, capacitance, capacitancePrefix, tolerancePlue, toleranceMinus, voltage);
        
        this.numCapacitors = numCapacitors;
        this.circuitType = circuitType;
    }
}