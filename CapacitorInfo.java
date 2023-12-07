package PMS;

/*

                            Jemyers

*/

public abstract class CapacitorInfo extends ProductInfo {
    double capacitance;
    int capacitancePrefix;
    int tolerancePlus;
    int toleranceMinus;
    double voltage;
    
    protected CapacitorInfo() {
        super();
        
        this.capacitance = -1;
        this.capacitancePrefix = -1;
        this.tolerancePlus = -1;
        this.toleranceMinus = -1;
        this.voltage = -1;
    }
    
    protected CapacitorInfo(String manufacturer, boolean availability, double price, int quantity, double capacitance, int capacitancePrefix, int tolerancePlue, int toleranceMinus, double voltage) {
        // To-Do: Validation
        super(manufacturer, availability, price, quantity);
        
        this.capacitance = capacitance;
        this.capacitancePrefix = capacitancePrefix;
        this.tolerancePlus = tolerancePlus;
        this.toleranceMinus = toleranceMinus;
        this.voltage = voltage;
    }
}

/* 

Subcategories: 
    - EDLCAndSupercapacitorInfo
    - MicaAndPTFEInfo
    - NetworksAndArraysInfo
    - TrimmerAndVariableInfo

*/