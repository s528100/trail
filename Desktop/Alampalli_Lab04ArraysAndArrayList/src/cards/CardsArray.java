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
/**Creates a class of name cards array with instance variables
 * of type arrays and integer  */
public class CardsArray {
    
    private Card[] clubs ; 
    private Card[] diamonds;
    private Card[] hearts;
    private Card[] spades;
    private int DECK_SIZE = 5;
    private int clubscount;
    private int diamondscount;
    private int heartscount;
    private int spadescount;

/**Creates a constructor with no argument */    
    public CardsArray(){
        clubs = new Card[DECK_SIZE];
        spades = new Card[DECK_SIZE];
        diamonds = new Card[DECK_SIZE];
        hearts = new Card[DECK_SIZE];
        
        clubscount = 0;
        diamondscount = 0;
        heartscount = 0;
        spadescount = 0;    
    }
    
/**Creates a getter method for getting clubs count
     * @return */
    public int getClubscount() {
        return clubscount;
    }

/**Creates a getter method for getting diamonds count
     * @return */
    public int getDiamondscount() {
        return diamondscount;
    }

/**Creates a getter method for getting hearts count
     * @return */
    public int getHeartscount() {
        return heartscount;
    }

/**Creates a getter method for getting spades count
     * @return */
    public int getSpadescount() {
        return spadescount;
    }
    
/**Creates a method for adding a card
     * @param c */    
    public void addCardsToArray(Card c){
        
        switch(c.getType())
        {
            case "hearts":if(heartscount<DECK_SIZE)
                        {
                        hearts[heartscount] = c;
                        heartscount++;
                        }
                        else{
                        removeCardsFromArray(0,"hearts");
                        hearts[DECK_SIZE-1]=c;
                         heartscount++;
                        }
            break;
            case "clubs":if(clubscount<DECK_SIZE){
                        clubs[clubscount] = c;
                        clubscount++;                
                        }
                        else{
                        removeCardsFromArray(0,"clubs");
                        clubs[DECK_SIZE-1]=c;
                        clubscount++;
                        }
            break;
            case "diamonds":if(diamondscount<DECK_SIZE){
                        diamonds[diamondscount] = c;
                        diamondscount++;                
                        }
                        else{
                        removeCardsFromArray(0,"diamonds");
                        diamonds[DECK_SIZE-1]=c;
                        diamondscount++;
                        }
            break;
            case "spades":if(spadescount<DECK_SIZE){
                       spades[spadescount] = c;
                        spadescount++;
                
                        }
                        else{
                        removeCardsFromArray(0,"spades");
                        spades[DECK_SIZE-1]=c;
                        spadescount++;
                        }
            break;
            default : break;
         }
            
    }
    
/**Creates a method for removing a card with parameters position and card type
     * @param position
     * @param cardType  */  
    public void removeCardsFromArray(int position, String cardType){
        if("hearts".equals(cardType)){
            if(position>=0 || position<heartscount){
                for(int i = position+1;i<DECK_SIZE ;i++){
                    hearts[i-1]=hearts[i];
                }
                heartscount--;
            }
        }
        else if("diamonds".equals(cardType)){
            if(position>=0 || position<diamondscount){
                for(int i = position+1;i<DECK_SIZE ;i++){
                    diamonds[i-1]=diamonds[i];
                }
                diamondscount--;
            }
        }
        else if("clubs".equals(cardType)){
            if(position>=0 || position<clubscount){
                for(int i = position+1;i<DECK_SIZE ;i++){
                    clubs[i-1]=clubs[i];
                }
                clubscount--;
            }
        }
        else if("spades".equals(cardType)){
            if(position>=0 || position<spadescount){
                for(int i = position+1;i<DECK_SIZE ;i++){
                    spades[i-1]=spades[i];
                }
                spadescount--;
            }
        } 
        
    }

/**Creates a to string to method to return all type of cards
     * @return all array types*/    
    @Override
    public String toString(){
        String a="" , b="" , c="" , d="";
        for(Card i : hearts){
            a = a+ "  " +i.getNumber();    
        }
        for(Card i : diamonds){
            if(i!= null){
            b = b+ "  " +i.getNumber();    
            }
        }
        for(Card i : spades){
            c = c+ "  " +i.getNumber();    
        }
        for(Card i : clubs){
            d = d+ "  " +i.getNumber();    
        }
            
        return "\nHearts Array:["+a+" ]\nDiamonds Array:["+b+" ]\nSpades Array:["+c+
                " ]\nClubs Array:["+d+" ]";
    }
    

}