/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

/**
 *
 * @author jmyer
 */
public final class TrimmerAndVariableInfo extends CapacitorInfo {
    String adjustment;
    double capacitanceRange;
    
    public TrimmerAndVariableInfo() {
        super();
        
        this.adjustment = "";
        this.capacitanceRange = -1;
    }
    
    public TrimmerAndVariableInfo(String manufacturer, boolean availability, double price, int quantity, double capacitance, int capacitancePrefix, int tolerancePlue, int toleranceMinus, double voltage, String adjustment, double capacitanceRange) {
        super(manufacturer, availability, price, quantity, capacitance, capacitancePrefix, tolerancePlue, toleranceMinus, voltage);
        
        this.adjustment = adjustment;
        this.capacitanceRange = capacitanceRange;
    }
}
