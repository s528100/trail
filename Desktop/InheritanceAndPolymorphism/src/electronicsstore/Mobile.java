/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.util.ArrayList;

/**
 *This is mobile class which gives model, processor, body, operatingSystem, battery
 * initialPrice and accessories 
 * @author Shravani Alampalli
 */
/*Creates a class of name mobile with extended class ElectronicStore
*with variables model, processor, body, operatingSystem, battery, initialPrice
*accessories of arraylist
*/
public class Mobile extends ElectronicStore {
    
    private String model;
    private String processor;
    private String operatingSystem;
    private String body;
    private double battery;
    private double initialPrice;
   
    ArrayList<String> accessories;

    /*Creates a no-argument constructor for a class mobile*/
    public Mobile() {
        
    }

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
    */
    public Mobile(String model, String processor, String operatingSystem, String body, double battery, double initialPrice, String storeName, String address, String contactNumber) {
        super(storeName, address, contactNumber);
        this.model = model;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.body = body;
        this.battery = battery;
        this.initialPrice = initialPrice;
        accessories =new ArrayList<>();
    }

    /*Creates a getter method for getting model
    *@return String,  returns the model of mobile
    */
    public String getModel() {
        return model;
    }

    /*Creates a getter method for getting processor
    *@return String,  returns the processor of mobile
    */
    public String getProcessor() {
        return processor;
    }

    /*Creates a getter method for getting operatingSystem
    *@return String,  returns the operating system of mobile
    */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /*Creates a getter method for getting body
    * @return String, returns body of mobile
    */
    public String getBody() {
        return body;
    }

    /*Creates a getter method for getting battery
    * @return double, returns battery of mobile
    */
    public double getBattery() {
        return battery;
    }

    /*Creates a getter method for getting initialPrice
    *@return double, returns initial price of mobile 
    */
    public double getInitialPrice() {
        return initialPrice;
    }

    /*Creates a getter method for getting accessories
    *@return ArrayList<String>, returns accessories of mobile
    */
    public ArrayList<String> getAccessories() {
        return accessories;
    }
    
    /*Creates a method named addAccessories for adding list to accessories
    *@return ArrayList<String>, returns added accessories of mobile
    */
    public ArrayList<String> addAccessories(String items){
        String[] list = items.split(",");
        for(String a: list){
            accessories.add(a);
        }        
        return accessories;    
    }

    /*Creates a toString method to return a string for mobile class
    *@return String, returns string for mobile class
    */
    @Override
    public String toString() {
        return model+" Details:"+"\nModel: " + model + "\nProcessor: " + 
                processor +"\nBattery: " + battery + "mAh\nBody: " + body + 
                "\nOperating System: " + operatingSystem + "\nInitial Price: $" +
                String.format("%.2f",initialPrice);
    }     
}