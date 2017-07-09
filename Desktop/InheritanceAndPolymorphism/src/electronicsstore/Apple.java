/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 *This is apple class with extended super class with super class variables model, processor,
 * body, operatingSystem, battery, initialPrice and accessories 
 * @author Shravani Alampalli
 */
/*Creates a apple class with extended class mobile*/
public class Apple extends Mobile {
    
    private final int STANDARD_BATTERY_LIFE = 12;

    /**
    *Creates a constructor for a class mobile 
    *arguments along with a super class arguments 
    * @param model This parameter gives the name of mobile
    * @param processor This parameter gives the name of processor
    * @param operatingSystem This parameter gives the operating system of mobile
    * @param body This parameter gives the body type of mobiles
    * @param battery This parameter gives the battery of mobile
    * @param initialPrice This parameter gives the initial price of mobiles
    * @param storeName This parameter gives the name of store for mobile 
    * @param address This parameter gives the address of the mobile
    * Creates a constructor for apple class with super class arguments*/
    public Apple(String model, String processor, String operatingSystem, String body, double battery, double initialPrice, String storeName, String address, String contactNumber) {
        super(model, processor, operatingSystem, body, battery, initialPrice, storeName, address, contactNumber);
    }

    /*Creates a no-argument constructor for apple class*/
    public Apple() {
        
    }
  
    /**
     * Creates a method to calculate battery life for apple class
     * @return double,batteryLife which returns the batteryLife of apple
     */
    public double calculateBatteryLife(int noOfHours4G){
        return STANDARD_BATTERY_LIFE/noOfHours4G;
    }
   
    /**
     * Creates a method to calculate cost for apple class
     * @return double,cost which returns the cost of apple
     */
    public double calculateCost(){
       double totalCost=getInitialPrice();
       if(super.getAccessories().contains("Bluetooth headsets"))
       {
           totalCost = totalCost + 99;
       }
       if(super.getAccessories().contains("USB cable"))
       {
           totalCost = totalCost + 20;
       }
       if(super.getAccessories().contains("Wired headsets with mic"))
       {
           totalCost = totalCost + 49;
       }
       if(super.getAccessories().contains("Extended 1 year warranty"))
       {
           totalCost = totalCost + 99;
       }
       if(super.getAccessories().contains("Charging Adapter"))
       {
           totalCost = totalCost + 39;
       } 
       return totalCost;
   }

    /**
     * Creates a toString method for apple class
     * @return String, returns string of apple 
     */
    @Override
    public String toString() {
        return super.toString();
    }    
    
}
