/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 * This is Television class with extended super class Electronic Store
 * @author S528100
 */
/*Creates a class of name television with extended ElectronicStore */
public class Television extends ElectronicStore {
    
    private String model;
    private String type;
    private double screensize;
    private double weight;
    private double cost;

    /*Creates a constructor for television with super class arguments*/
    public Television(String model, String type, double screensize, double weight, double cost, String name, String address, String contactNumber) {
        super(name, address, contactNumber);
        this.model = model;
        this.type = type;
        this.screensize = screensize;
        this.weight = weight;
        this.cost = cost;
    }

    /*Creates a no-arguments constructor for television*/

    public Television(String storeName, String address, String contactNumber) {
        super(storeName, address, contactNumber);
    }
    
    /**
     * Creates a getter method for getting model
     * @return String, returns model of television
     */
    public String getModel() {
        return model;
    }

     /**
      * Creates a getter method for getting type
      * @return String, returns type of television
      */
    public String getType() {
        return type;
    }

     /**
      * Creates a getter method for getting screenSize
      * @return double, returns screen size of television
      */
    public double getScreensize() {
        return screensize;
    }

     /**
      * Creates a getter method for getting screenSize
      * @return double, returns weight of television
      */
    public double getWeight() {
        return weight;
    }

    /**
      * Creates a getter method for getting screenSize
      * @return double, returns cost of television
      */
    public double getCost() {
        return cost;
    }
    
    /**
     * Creates a method to calculate cost for television class
     * @return double, returns cost
     */
    public double calculateCost(boolean is3D, boolean isAutoPowerOff,boolean isGameMode){
        boolean a = true;
        double cost1=0, cost2=0, cost3 = 0;
        if(a == is3D){
            cost1 = 100;
        }
        if(a == isAutoPowerOff ){
            cost2 = 25;
        }
        if(a == isGameMode ){
            cost3 = 25;
        }
        
        return (cost+cost1+cost2+cost3);
    }

    /**
     * Creates a toString method for television class
     * @return String, returns string of television
     */
    @Override
    public String toString() {
        return "Television Details:\n" + "Model:" + model + "\nType:" + type + "\nScreensize:" + screensize + "\nWeight:" + weight+"kgs" ;
    }
    
    
    
    
    
}
