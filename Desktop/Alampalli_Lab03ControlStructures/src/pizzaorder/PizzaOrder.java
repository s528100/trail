/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

/**
 *
 * @author Shravani Alampalli
 */
/**Creates a class on pizza order with required variables for storing data*/
public class PizzaOrder {
    private String name;
    private String address;
    private String contactNumber;
    private char size;
    private final double BASIC_CRUST_COST = 4.0;
    private final double BASIC_CHEESE_COST = 2.0;
    private final double BASIC_SAUCE_COST = 0.50;
    private final double DELIVERY_CHARGE = 2.75;
    private String toppings;
    
/**Creating a constructor with five argument
     * @param name is used to intialise a name of pizzaOrder   
     * @param address is used to give address for delivering pizza   
     * @param contactNumber is used for storing a contact number of order name   
     * @param size  is to give a size of pizza  
     * @param toppings is used to add different types of toppings*/       
    public PizzaOrder(String name,String address, String contactNumber,
            char size , String toppings){
        this.name=name;
        this.address=address;
        this.contactNumber=contactNumber;
        this.size=size;
        this.toppings=toppings;    
    }
    
/**Creates a getter method for getting a order name
     * @return name */
    public String getName() {
        return name;
    }
    
/**Creates a getter method for getting a address
     * @return address */    
    public String getAddress() {
        return address;
    }

    /**Creates a getter method for getting a contact number
     * @return contact number */
    public String getContactNumber() {
        return contactNumber;
    }

    /**Creates a getter method for getting a size
     * @return  size */
    public char getSize() {
        return size;
    }

    /**Creates a getter method for getting a basic crust cost
     * @return BASIC_CRUST_COST */
    public double getBASIC_CRUST_COST() {
        return BASIC_CRUST_COST;
    }

    /**Creates a getter method for getting a basic cheese cost
     * @return  BASIC_CHEESE_COST*/
    public double getBASIC_CHEESE_COST() {
        return BASIC_CHEESE_COST;
    }
    
    /**Creates a getter method for getting a basic sauce cost
     * @return BASIC_SAUCE_COST */
    public double getBASIC_SAUCE_COST() {
        return BASIC_SAUCE_COST;
    }
    
    /**Creates a getter method for getting a toppings that to be added
     * @return toppings */
    public String getToppings() {
        return toppings;
    }
    
    /**Creates a getter method for getting a delivery charges
     * @return DELIVERY_CHARGE */
    public double getDELIVERY_CHARGE(){
        return DELIVERY_CHARGE;
    }
    
    /**Creates a getter method for calculating number of toppings
     * @return numberOfToppings */
    public int getNumberOfToppings(){
        int numberOfToppings=1;
        int i = 0;
        char a = ',';
        for(int k=0; i<=toppings.length()-1; i++ )
        {
           if(toppings.charAt(i)==a)
               numberOfToppings++;
           }
        return numberOfToppings;
    }
    
    /**Creates a getter method for getting a final crust cost using switch case
     * @return finalCrustCost */    
    public double getFinalCrustCost(){
        double finalCrustCost;
        switch(size){
            case 'S': finalCrustCost = BASIC_CRUST_COST;
                    break;
            case 'M': finalCrustCost = BASIC_CRUST_COST+0.3*BASIC_CRUST_COST;
                    break;
            default : finalCrustCost = BASIC_CRUST_COST+0.6*BASIC_CRUST_COST;
        }
        return finalCrustCost;
    }
    
    /**Creates a getter method for getting a final cheese cost using switch cost
     * @return finalCheeseCost */
    public double getFinalCheeseCost(){
        double finalCheeseCost;
        switch(size){
            case 'S': finalCheeseCost = BASIC_CHEESE_COST;
                    break;
            case 'M': finalCheeseCost = BASIC_CHEESE_COST+0.4*BASIC_CHEESE_COST;
                    break;
            default : finalCheeseCost = BASIC_CHEESE_COST+0.8*BASIC_CHEESE_COST;
        }
        return finalCheeseCost;
    }
    
    /**Creates a getter method for getting a topping cost using switch case
     * @return  toppingCost*/
    public double getToppingCost(){
        double toppingCost;
        switch(size){
            case 'S': toppingCost = 1.5*getNumberOfToppings();
                    break;
            case 'M': toppingCost = 2.0*getNumberOfToppings();
                    break;
            default : toppingCost = 2.5*getNumberOfToppings();
        }
        return toppingCost;    
    }
    
    /**Creates a getter method for getting a final price
     * @param deliveryOption
     * @return finalPrice*/
    public double getFinalPrice(char deliveryOption){
        double finalPrice;
        if(deliveryOption == 'D')
        {
            finalPrice = getFinalCrustCost()+getFinalCheeseCost()+
                    getToppingCost()+ BASIC_SAUCE_COST + getDELIVERY_CHARGE();
        }
        else
        {
            finalPrice = getFinalCrustCost()+getFinalCheeseCost()+
                    getToppingCost()+ BASIC_SAUCE_COST ;
        }
        return finalPrice;
    }

    /**Creates a toString method to return values required
     * @return in a string*/
    @Override
    public String toString() {
        return ("Order name :" + name + "\nAddress :" + address 
                + "\nContact Number:" + contactNumber + "\nPizza Size=" + size + 
                "\nNumber Of Toppings:"+getNumberOfToppings()+"\nCrust cost:$"+
                getFinalCrustCost()+"\nSauce cost:$"+BASIC_SAUCE_COST+
                "\nCheese cost:$"+getFinalCheeseCost()+"\nToppings cost:$"+
                getToppingCost());
    }    

    
    
}
