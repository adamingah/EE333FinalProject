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
    int operatingTempPlus;
    boardAdheranceEnum mountingType;
    
}

/* 

Subcategories: 
    - EDLCAndSupercapacitorInfo
    - MicaAndPTFEInfo
    - NetworksAndArraysInfo
    - TrimmerAndVariableInfo

*/

final class EDLCAndSupercapacitorInfo extends CapacitorInfo {
     
}

final class MicaAndPTFEInfo extends CapacitorInfo {
    String dielectricMaterial;
    String features;
    
}

final class NetworksAndArraysInfo extends CapacitorInfo {
    int numCapacitors;
    String circuitType;
}

final class TrimmerAndVariableInfo extends CapacitorInfo {
    String adjustment;
    double capacitanceRange;
}

enum boardAdheranceEnum {
    THM,
    SMD,
}