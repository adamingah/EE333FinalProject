/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMS;

/**
 *
 * @author jmyer
 */
public abstract class DevBoardInfo extends ProductInfo {
    String series;
}

final class evaluationBoardInfo extends DevBoardInfo {
    String boardType;
    String platform;
    double supplyVoltage;
}

/*
    Programmers, Emulators, and Debuggers
*/
final class PEDBoardInfo extends DevBoardInfo {
    boolean PSUIncluded;
    String relatedProduct;
    
}

final class softwareInfo extends DevBoardInfo {
    String edition;
    int liscenceLength;
    String deliveryType;
}

enum mountingTypeEnum {
    fixed,
    socket
}