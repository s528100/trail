/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S528100
 */
public class ElectronicStoreDriver {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("electronics.txt"));
        String name = sc.nextLine();
        String address = sc.nextLine();
        String contactNumber = sc.nextLine();
        ElectronicStore e1=new ElectronicStore(name, address, contactNumber);
        System.out.println(e1);
        System.out.println("************************************************");
        
        while(sc.hasNext()){
            String e2 = sc.nextLine();
                if("Mobile".equals(e2)){
                  String model = sc.nextLine();
                  if("iPhone".equals(model)){
                        String processor = sc.nextLine();
                        String operatingSystem = sc.nextLine() ;
                        String body = sc.nextLine();
                        double battery = sc.nextDouble();
                        double initialPrice = sc.nextDouble();
                        Apple a1=new Apple(model, processor, operatingSystem, body, battery, initialPrice, name, address, contactNumber);
                        System.out.println(a1);
                        sc.nextLine();
                        String s=sc.nextLine();
                        a1.addAccessories(s);
                        int i=sc.nextInt();
                        double d=a1.calculateBatteryLife(i);
                        System.out.println("Battery Life: "+String.format("%.2f",d)+"hours");
                        System.out.println("Total Price: $"+String.format("%.2f",a1.calculateCost()));
                        System.out.println("************************************************");
                  }
                  else{
                           
                        Samsung s1=new Samsung(model, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), name, address, contactNumber);
                        System.out.println(s1);
                        sc.nextLine();
                        String s2=sc.nextLine();
                        s1.addAccessories(s2);
                        int j=sc.nextInt();
                        double a=s1.calculateBatteryLife(j);
                        System.out.println("Battery Life: "+String.format("%.2f",a)+"hours");
                        System.out.println("Total Price: $"+String.format("%.2f",s1.calculateCost()));
                        System.out.println("************************************************");
                  }
            }
                else if("Television".equals(e2)){ 
                        String a4= sc.nextLine();
                        String a5= sc.nextLine();
                        double a6= sc.nextDouble();
                        double a7= sc.nextDouble();
                        double a8= sc.nextDouble();
                        boolean a1=sc.nextBoolean();
                        boolean a2=sc.nextBoolean();
                        boolean a3=sc.nextBoolean();
                        Television st1=new SmartTelevision( a4, a5, a6, a7, a8, name, address, contactNumber,a1 ,a2,a3);
                        //It's a polymorphism implementation
                        System.out.println(st1);
                        st1.calculateCost(a1, a2, a3);
                        System.out.println("Total Ccost:$" +String.format("%.2f",st1.calculateCost(a1,a2,a3)));
                        System.out.println("************************************************");
                }
        }
        
       
       
    }
    
}
