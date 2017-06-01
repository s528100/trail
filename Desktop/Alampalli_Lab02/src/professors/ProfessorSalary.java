/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professors;

/**
 *
 * @author Shravani Alampalli
 */

/**Constructs a class of name ProfessorSalary which consists of private 
 variables required to calculate salaries  */
public class ProfessorSalary {
    private double hourlyRate;
    private double bonus;
    private double insuranceRate;
    private double taxRate;
    private final int hours = 40;
 
/**Constructs a class with arguments
     * @param hourlyRate
     * @param bonus
     * @param insuranceRate
     * @param taxRate */
    
    public ProfessorSalary(double hourlyRate, double insuranceRate, double taxRate ,double bonus){
        this.hourlyRate= hourlyRate;
        this.bonus= bonus;
        this.insuranceRate= insuranceRate;
        this.taxRate= taxRate;
    }

/**Constructs a class with no-arguments  */    
    public ProfessorSalary(){
        
    }

/** Constructs a method to get a hourly rate
     * @return  */    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
/** Constructs a method to get a bonus
     * @return  */     
    public double getBonus(){
        return bonus;
    }

/** Constructs a method to get a insurance rate
     * @return  */     
    public double getInsuranceRate(){
        return insuranceRate;
    }
 
/** Constructs a method to get a tax rate
     * @return  */ 
    public double getTaxRate(){
        return taxRate;
    }
    
/** Constructs a method to set a hourly rate
     * @param hourlyRate */     
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

/** Constructs a method to  set a bonus
     * @param bonus */     
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

/** Constructs a method to set a insurance rate
     * @param insuranceRate */     
    public void setInsuranceRate(double insuranceRate){
        this.insuranceRate = insuranceRate;
    }

/** Constructs a method to set a tax rate
     * @param taxRate */     
    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

/** Constructs a method to calculate monthly salary
     * @return  */      
    public double monthlySalary(){
      double monthlySalary;
      monthlySalary = hours*hourlyRate*4;
      return monthlySalary;
    }

/** Constructs a method to calculate monthly insurance
     * @return  */      
    public double monthlyInsurance(){
        double monthlyInsurance;
        monthlyInsurance= (insuranceRate*hours*hourlyRate*4/100);
        return monthlyInsurance;
    }

/** Constructs a method to calculate annual gross salary
     * @return  */      
    public double annualGrossSalary(){
        double annualGrossSalary;
        annualGrossSalary=( (hours*hourlyRate*12*4 )+ bonus);
        return annualGrossSalary;
    }
    
    /** Constructs a method to calculate annual net salary
     * @return  */      
    public double annualNetSalary(){
        double annualNetSalary, annualTax;
        double annualInsurance = (insuranceRate*hours*hourlyRate*4*12/100);
        annualTax = (taxRate*hours*hourlyRate*4*12/100);
        annualNetSalary=( (bonus +hours*hourlyRate*12*4)- annualInsurance - annualTax);
        return annualNetSalary;
    }
   
    /** Constructs a toString method to print the given value
     * @return s*/
    @Override
    public String toString(){
        return ("Testing the toString for ProfessorSalary class:" + "Hourly pay"
                + " Rate:" + hourlyRate  + " " + "," + "Insurance Rate:" + 
                insuranceRate  + " "+"," + "tax: " + taxRate + " "+"," +
                "annual bonus: "+  bonus + " " +", " +"Hours per week:" + 
                + hours +" " );
    }
   
    
    
}
