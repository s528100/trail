/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author Shravani Alampalli
 */
public abstract class AbstractStoreEmployee implements Employee, Store {
    
    private double basePay;
    private String employeeName;
    private double hourlyRate;
    private double numberOfHoursWorked;
    private String storeDetails;

    public AbstractStoreEmployee(double basePay, String employeeName, double hourlyRate, double numberOfHoursWorked, String storeDetails) {
        this.basePay = basePay;
        this.employeeName = employeeName;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.storeDetails = storeDetails;
    }
    
    @Override
    public double calculateCommisssion(){
        return 0;
    }
    
    @Override
    public abstract double calculatePay();
    
    /**
     *
     * @return
     */
    @Override
    public abstract boolean checkPromotionEligibility();
    
    public double calculateRemainingStoreRevenue(double storeSales){
        double employeePay = calculatePay();
        double storeRevenue=0;
        
        storeRevenue = storeSales*(1- TAX ) - employeePay;
        if(storeSales>255000){
             storeRevenue = storeRevenue*(1-0.05);    
        } 
        else if(storeSales>155000 && storeSales<=255000 ){
             storeRevenue = storeRevenue*(1-0.03);    
        }
        else{
              storeRevenue = storeRevenue*(1-0.01);
        }
        return  storeRevenue ;
    }
    
    

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        employeeName = employeeName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(String storeDetails) {
        this.storeDetails = storeDetails;
    }

    @Override
    public String toString() {
        return "Store Details: " + storeDetails + "\nEmployee Name: "+ employeeName +
                "\nBase Pay: $"+basePay + "\nNumber of Hours worked: "  + numberOfHoursWorked
                + "hrs\nPayment Rate per hour: $" + hourlyRate+"/hr\n";
    }
        
}
