/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

import java.util.Scanner;

/**
 *
 * @author Shravani Alampalli
 */
public class PizzaOrderDriver {
    
    public static void main(String [] args){
        String address = null;
        char add;
        
        System.out.println("Welcome to Northwest Pizza!");
        do{
            Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name for order : ") ;
        String name = sc.nextLine();
        System.out.print("Please choose your pick up'P' or delivery 'D':");
        char c = sc.nextLine().charAt(0);
        if(c == 'D'){
            System.out.print("Please enter your address:");
            address = sc.nextLine();
        }
      
        System.out.print("Please enter your contact number:");
        String contactNumber = sc.nextLine();
        System.out.print("Please choose the size of pizza(S/M/L):");
        char size = sc.nextLine().charAt(0);        
        System.out.print("Please enter the toppings you want to add separated by a comma: ");
        String toppings = sc.nextLine(); 
        System.out.println("**************************************");
        System.out.println("Please review your order below:");
        PizzaOrder p = new PizzaOrder(name , address , contactNumber , size , toppings);        
        System.out.println(p.toString());
        
        System.out.println("\nDelivery Charges :$ "+p.getDELIVERY_CHARGE());
        System.out.println("**************************************");
        System.out.println("Total bill amount to be paid :$" +p.getFinalPrice(c));
        System.out.println("**************************************");
        System.out.println("Do you wish to place another order?(Y/N):");
        
        add = sc.next().charAt(0); 
        }while(add == 'Y');
        System.out.println("Thank You for your order!");       
        }
    }
           
    

