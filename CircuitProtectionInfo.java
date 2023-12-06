/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

/**
 *
 * @author jmyer
 */
public abstract class CircuitProtectionInfo extends ProductInfo {
    double voltageRating;
    double currentRating;
}

final class breakerInfo extends CircuitProtectionInfo {
    int numPoles;
    String breakerType;
}

final class fuseInfo extends CircuitProtectionInfo {
    double breakingCapacity;
    fuseResponseTime responseTime;
    double meltingI2t;
}

final class fuseholderInfo extends CircuitProtectionInfo {
    double fuseLength;
    double fuseWidth;
    String material;
    String contactMaterial;
}

final class TVSInfo extends CircuitProtectionInfo {
    double activationVoltage;
    double peakPulseCurrent;
    TVSTypeEnum classification;
}

enum TVSTypeEnum {
    surgeProtection, thyristor, diode, varistor
}

enum fuseResponseTime {
    fast, medium, slow
}