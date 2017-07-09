/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 * This is SmartTelevision class with extended super class Television
 * @author Shravani Alampalli
 */
/*
*Creates a class named SmartTelevision with extended super class Television
*/
public class SmartTelevision extends Television {
    
    private boolean is3D;
    private boolean isAutoPowerOff;
    private boolean isGameMode;

    /*Creates a constructor along with super class arguments */
    public SmartTelevision(String model, String type, double screensize, double weight, double cost, String name, String address, String contactNumber, boolean is3D, boolean isAutoPowerOff, boolean isGameMode) {
        super(model, type, screensize, weight, cost, name, address, contactNumber);
        this.is3D = is3D;
        this.isAutoPowerOff = isAutoPowerOff;
        this.isGameMode = isGameMode;
    }

    /*Creates a no-argument for SmartTelevision*/
    public SmartTelevision(String model, String type, double screensize, double weight, double cost, String name, String address, String contactNumber) {
        super(model, type, screensize, weight, cost, name, address, contactNumber);
    }

    /**
     * Creates a toString method for smart television class
     * @return String, returns string of television
     */
    @Override
    public String toString() {
        return super.toString()+"\nis3D:"+is3D+"\nisAutoPowerOff:"+isAutoPowerOff+"\nisGameMode:"+isGameMode;
    }
    
    
    
    
    
    
}
