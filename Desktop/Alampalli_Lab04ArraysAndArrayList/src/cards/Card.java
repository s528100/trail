/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author Shravani Alampalli
 */

/**Creates a card class with variables number and type to differentiate type and number */
public class Card {
    private int number;
    private String type;
    
/**Creates a constructor with two arguments of type integer and string
     * @param number is used as card number   
     * @param type is used to know the typeof a card*/   
       public Card(int number, String type){
           this.number=number;
           this.type=type;
       }
       
/**Creates a getter method for getting a number
     * @return number*/
    public int getNumber() {
        return number;
    }
    
/**Creates a getter method for getting a type of a card
     * @return card*/
    public String getType() {
        return type;
    }
    
/**Creates a setter method for setting a number of a card
     * @param number is setted */
    public void setNumber(int number) {
        this.number = number;
    }

/**Creates a setter method for setting a type of a card
     * @param type is setted */
    public void setType(String type) {
        this.type = type;
    }

/**Creates a toString to return a string
     * @return */
    @Override
    public String toString() {
        return "Card{" + "number=" + number + ", type=" + type + '}';
    }
                
}
