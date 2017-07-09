/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;
/**
 *This is samsung class with extended super class with super class variables model, processor,
 * body, operatingSystem, battery, initialPrice and accessories 
 * @author Shravani Alampalli
 */
/*Creates a class of name samsung with extended class mobile*/
public class Samsung extends Mobile{
    
    private final int STANDARD_BATTERY_LIFE = 10;
/**
    *Creates a constructor for a class samsung 
    *arguments along with a super class arguments 
    * @param model This parameter gives the name of mobile
    * @param processor This parameter gives the name of processor
    * @param operatingSystem This parameter gives the operating system of mobile
    * @param body This parameter gives the body type of mobiles
    * @param battery This parameter gives the battery of mobile
    * @param initialPrice This parameter gives the initial price of mobiles
    * @param storeName This parameter gives the name of store for mobile 
    * @param address This parameter gives the address of the mobile
    *Creates a constructor for samsung along with super class arguments */
    public Samsung(String model, String processor, String operatingSystem, String body, double battery, double initialPrice, String storeName, String address, String contactNumber) {
        super(model, processor, operatingSystem, body, battery, initialPrice, storeName, address, contactNumber);
    } 

    /*Creates a no-argument constructor for samsung class*/
    public Samsung() {
        
    }
    
    /**
     * This method is to calculate battery life
     * @param noOfHours4G
     * @return double, returns the battery life
     */
    public double calculateBatteryLife(int noOfHours4G){
        return STANDARD_BATTERY_LIFE/noOfHours4G;
    }
    
    /**
     * This method calculates the cost of samsung mobile
     * @return double, returns the cost
     */
    public double calculateCost(){
       double totalCost=0;
       if(super.getAccessories().contains("Bluetooth headsets"))
       {
           totalCost = totalCost + 79;
       }
       if(super.getAccessories().contains("USB cable"))
       {
           totalCost = totalCost + 17;
       }
       if(super.getAccessories().contains("Wired headsets with mic"))
       {
           totalCost = totalCost + 39;
       }
       if(super.getAccessories().contains("Extended 1 year warranty"))
       {
           totalCost = totalCost + 89;
       }
       if(super.getAccessories().contains("Charging Adapter"))
       {
           totalCost = totalCost + 29;
       }
       return super.getInitialPrice() + totalCost;
    }

    /**
     * Creates a toString method for samsung class
     @return String, returns String of samsung class*/
    @Override
    public String toString() {
        return super.toString();
    }
    
}
