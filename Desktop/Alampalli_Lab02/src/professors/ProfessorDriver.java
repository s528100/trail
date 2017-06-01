/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professors;

import java.util.Scanner;

/**
 *
 * @author Shravani Alampalli
 */
public class ProfessorDriver {
   
    
    public static void main(String [] args){
        // created the professor object with 4 argument constructor
        Professor profObject01 = new Professor("Michael","Downey",50988,
                "6602240486", "9277 Fairway Drive, Apt#208, Des Plaines, IL");
        System.out.println("Professor Details01");
        System.out.println("Professor ID: "+profObject01.getProfessorId());
        System.out.println("Name: " + profObject01.getFirstName() +
                " "+ profObject01.getLastName());
        System.out.println("Address: "+profObject01.getAddress());
        System.out.println("Contact Number: "+profObject01.getPhoneNumber());
        System.out.println("*****************************************"
                + "*********\n");
        
        // created the professor object with no-argument constructor
        Professor profObject02 = new Professor();
        System.out.println("Professor Details02");
        System.out.println("Professor ID: "+profObject02.getProfessorId());
        System.out.println("Name: " + profObject02.getFirstName() +
                " "+ profObject02.getLastName());
        System.out.println("Address: "+profObject02.getAddress());
        System.out.println("Contact Number: "+profObject02.getPhoneNumber());
        System.out.println("********************************************"
                + "******\n");
        
        // now set the value of attributes for the profObject02
        profObject02.setProfessorId(12345);
        profObject02.setFirstName("Julie");
        profObject02.setLastName("Clark");
        profObject02.setPhoneNumber("9494949494");
        profObject02.setAddress("1231 University Drive, Apt#60, Kansas, MO");        
        System.out.println("Testing toString() method of Professor class:\n"+
                profObject02.toString());
        
        
        //5a
         Scanner scObj = new Scanner(System.in);
         System.out.println("Testing the professorSalary class : ");
         System.out.print(" Enter  the hourly pay rate of the professor : $");
         double hourlyRate;
         double bonus;
         double insuranceRate;
         double taxRate;
         int hours = 40;
         hourlyRate = scObj.nextDouble();
         System.out.println(" ");
         System.out.print(" Enter  the insurance rate of the professor in "
                 + "percentage: ");
         insuranceRate = scObj.nextDouble();
         System.out.println(" ");
         System.out.print(" Enter  the tax rate of the professor in "
                 + "percentage: ");
         taxRate = scObj.nextDouble();
         System.out.println(" ");
         System.out.print(" Enter  the bonus amount : $ ");
         bonus = scObj.nextDouble();
         
        ProfessorSalary ProfessorSalaryObj1 , ProfessorSalaryObj2;
        ProfessorSalaryObj1 = new ProfessorSalary(hourlyRate,
                insuranceRate, taxRate,bonus);
         System.out.println( ProfessorSalaryObj1.toString());
         System.out.println("The monthly salary of the professor is : $ "+
                 ProfessorSalaryObj1.monthlySalary() );
         System.out.println("The monthly insurance of the professor is : $ "+
                 ProfessorSalaryObj1.monthlyInsurance() );
         System.out.println("The annual gross salary of the professor is : "+
                 ProfessorSalaryObj1.annualGrossSalary() );
         System.out.println("The annual net salary of the professor is : "+
                 ProfessorSalaryObj1.annualNetSalary() );
        
        System.out.println("The details of professorSalaryObj2 are as follows:");
        ProfessorSalaryObj2 = new ProfessorSalary();
        System.out.println( ProfessorSalaryObj2.toString());
         System.out.println("The monthly salary of the professor is : $ "+
                 ProfessorSalaryObj2.monthlySalary() );
         System.out.println("The monthly insurance of the professor is : $ "+
                 ProfessorSalaryObj2.monthlyInsurance() );
         System.out.println("The annual gross salary of the professor is : "+
                 ProfessorSalaryObj2.annualGrossSalary() );
         
        ProfessorSalaryObj2.setHourlyRate(42.85);
        ProfessorSalaryObj2.setInsuranceRate(15.30);
        ProfessorSalaryObj2.setTaxRate(11.50);
       ProfessorSalaryObj2.setBonus(6344.66);
       System.out.println( ProfessorSalaryObj2.toString());
         System.out.println("The monthly salary of the professor is : $ "+
                 ProfessorSalaryObj2.monthlySalary() );
         System.out.println("The monthly insurance of the professor is : $ "+
                 ProfessorSalaryObj2.monthlyInsurance() );
         System.out.println("The annual gross salary of the professor is : "+
                 ProfessorSalaryObj2.annualGrossSalary() );
          System.out.println("The annual net salary of the professor is : "+
                 ProfessorSalaryObj2.annualNetSalary() );
        
    }
}
