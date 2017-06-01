/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Creates a package with name professors which consists of info */
package professors;

/**
 *
 * @author Shravani Alampalli
 */

/** Creates a class on professor with required variables for storing data*/
public class Professor {
    private String firstName;
    private String lastName;
    private int professorId;
    private String phoneNumber;
    private String address;
    
    
    /** Creates a constructor with argument
     * @param firstName
     * @param lastName
     * @param professorId
     * @param phoneNumber
     * @param address*/
    public Professor(String firstName, String lastName, int professorId, String phoneNumber, String address){
        this.firstName=firstName;
        this.lastName= lastName;
        this.professorId= professorId;
        this.phoneNumber = phoneNumber;
        this.address= address;
    }
    
    /** Creates a constructor with no-arguments*/
    public Professor(){
        
    }
    
    /** Constructs a method for getting a firstName of professors
     * @return */
    public String getFirstName(){
       return firstName;
    }
    
    /** Constructs a method for getting a lastname of professors
     * @return */
    public String getLastName(){
        return lastName;
    }
    
    /** Constructs a method for getting a Id number of professors
     * @return */
    public int getProfessorId(){
        return professorId;
    }
   
    /** Constructs a method for getting a phone number of professors
     * @return */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    /** Constructs a method for getting a address of professors
     * @return */
    public String getAddress(){
        return address;
    }
   
    /** Constructs a method for setting a firstname of professors
     * @param firstName */
    public void setFirstName(String firstName){
        this.firstName=firstName;
   }
    
    /** Constructs a method for setting a lastname of professors
     * @param lastName */
    public void setLastName(String lastName){ 
        this.lastName=lastName;
    }
    
    /** Constructs a method for setting a phone number of professors
     * @param phoneNumber */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
     /** Constructs a method for setting a Id number of professors
     * @param professorId */
    public void setProfessorId(int professorId){
        this.professorId = professorId;
    }
    
     /** Constructs a method for setting a address of professors
     * @param address */
    public void setAddress(String address){
       this.address = address; 
    }
    
    /** Constructs a toString method to return the details of a professor
     * @return */
    @Override
    public String toString(){
        return (firstName + " " + lastName + " " + professorId + phoneNumber + " " + address +" " );
    }
}
