/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 *
 * This is Electronic store class which gives the store name, address 
 * and contact number.
 * @author Shravani Alampalli
 */
/*Creates a class named ElectronicStore
*with variables storeName, address, contactNumber of data type string
*/
public class ElectronicStore {
    
    private String storeName;
    private String address;
    private String contactNumber;
    
    /**
     * This three argument constructor 
     * @param storeName This parameter gives the storeName
     * @param address This parameter gives the address
     * @param contactNumber This parameter gives the contact number
     */
    public ElectronicStore(String storeName, String address, String contactNumber) {
        this.storeName = storeName;
        this.address = address;
        this.contactNumber = contactNumber;
    }
    
    /*Creates a no-constructor for class ElectronicStore */
    public ElectronicStore() {
        
    }
    
    /**
     * This method is used to get the store name
    * Creates a getter method for getting StoreName
    * @return String, returns the store name
    */
    public String getStoreName() {
        return storeName;
    }
    /**
    * This method is used to get the address
    *Creates a getter method for getting Address
    * @return String, returns the address
    */
    
    public String getAddress() {
        return address;
    }

    /**
     * This method is used to get the contact number
    *Creates a getter method for getting ContactNumber
    * @return String, returns the contactNumber
    */
    public String getContactNumber() {
        return contactNumber;
    } 

    /**
     * Creates a toString method to return a string for getting details of an electronic store
     * @return String, returns string of electronic store
     */
    @Override
    public String toString() {
        return "Electronic Store Details:\n" + "Store Name:" + storeName + 
       "\nStore Address:" + address + "\nStore Contact Number:" + contactNumber;
    }

    
}
