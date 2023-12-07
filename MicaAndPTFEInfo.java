/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

/**
 *
 * @author jmyer
 */
public final class MicaAndPTFEInfo extends CapacitorInfo {
    String dielectricMaterial;
    String features;
    
    public MicaAndPTFEInfo() {
        super();
        
        this.dielectricMaterial = "";
        this.features = "";
    }
    
    public MicaAndPTFEInfo(String manufacturer, boolean availability, double price, int quantity, double capacitance, int capacitancePrefix, int tolerancePlue, int toleranceMinus, double voltage, String dielectricMaterial, String features) {
        super(manufacturer, availability, price, quantity, capacitance, capacitancePrefix, tolerancePlue, toleranceMinus, voltage);
        
        this.dielectricMaterial = dielectricMaterial;
        this.features = features;
    }
}
