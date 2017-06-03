/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;


/**
 *
 * @author Shravani Alampalli
 */
/**Creates a class for arraylist of name CardsArrayList with instance variables 
  *of type arraylist of names clubs, diamonds, hearts, spades */
public class CardsArrayList {
    
    private ArrayList<Card> clubs = new ArrayList<Card>();
    private ArrayList<Card> diamonds = new ArrayList<Card>();
    private ArrayList<Card> hearts = new ArrayList<Card>();
    private ArrayList<Card> spades = new ArrayList<Card>();

/**Creates a no argument constructor for class CardsArrayList*/    
    public CardsArrayList(){
        
    }

/**Creates a getter method for getting clubs
     * @return clubs arraylist*/
    public ArrayList<Card> getClubs() {
        return clubs;
    }

/**Creates a getter method for getting diamonds
     * @return diamonds arraylist*/
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

/**Creates a getter method for getting hearts
     * @return hearts arraylist*/
    public ArrayList<Card> getHearts() {
        return hearts;
    }

/**Creates a getter method for getting spades
     * @return spades arraylist*/
    public ArrayList<Card> getSpades() {
        return spades;
    }

/**Creates a method with a name addCardsToList of string type for 
  * adding a string and knowing whether a card is added or not    
  * @param c    
  * @return String whether a card is added or not */    
    public String addCardsToList(Card c){
        String a = null;
        switch(c.getType()){
            case "clubs" : getClubs().add(c);
                    a= "card added successfully";
                    break;                    
            case "diamonds":getDiamonds().add(c);
                    a = "card added successfully";
                     break;
            case "hearts":getHearts().add(c);
                    a= "card added successfully";
                     break;
            case "spades":getSpades().add(c);
                    a=  "card added successfully";
                     break;
        }
        return a;
    }  
    
/**Creates a method with a name removeCardsFromList of string type with
 * parameters position and ArrayList for removing a card from desired position 
 * in a desired arraylist@return String whether a card is removed or not 
     * @param position 
     * @param c 
     * @return  */ 
    public String removeCardsFromList(int position, ArrayList<Card> c){
        String b ;
        if(position<0 || position >=c.size()){
            b = ("ArrayList size underflow, card cannot be removed");
        }
        else{
            c.remove(position);
            b = "Card is removed successfully!";
        }
        return b;
    }

/**Creates a toString method for returning all the arraylist
 * @return  */
    @Override
   public String toString(){
        String str="" , str1="" , str2="" , str3="";
        for(Card name : hearts){
            str = str+ "  " +name.getNumber();    
        }
        for(Card name : diamonds){
            str1 = str1+ "  " +name.getNumber();    
        }
        for(Card name : spades){
           str2 = str2+ "  " +name.getNumber();
        }
        for(Card name : clubs){
           str3 = str3+ "  " +name.getNumber();
        }        
        return "Hearts ArrayList:["+str+" ]\nDiamonds ArrayList:["+str1+
                " ]\nSpades ArrayList:["+str2+" ]\nClubs ArrayList:["+str3+" ]";
    }    
}
