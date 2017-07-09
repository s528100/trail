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
public class Manager extends AbstractStoreEmployee{
    
    private double bonusRate;
    private double salesDone;
    private double totalStoreSales;

    public Manager(double totalStoreSales, double salesDone, double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay, String name) {
        super(basePay, name, hourlyRate, numberOfHoursWorked, storeDetails);
        this.bonusRate = bonusRate;
        this.salesDone = salesDone;
        this.totalStoreSales = totalStoreSales;
    }

    public Manager(double basePay, String employeeName, double hourlyRate, double numberOfHoursWorked, String storeDetails) {
        super(basePay, employeeName, hourlyRate, numberOfHoursWorked, storeDetails);
    }

    @Override
    public double calculatePay() {
        
        if(salesDone>25000){
            bonusRate = 15.0;    
        }
        else if(salesDone>5000 && salesDone<=25000){
            bonusRate = 10.0;
        }
        else {
            bonusRate = 1.0;
        }    
        return (super.getHourlyRate()*super.getNumberOfHoursWorked()+
                super.getBasePay())*(1+bonusRate/100);    
    }
    
    public double salesPercentByManager(){
        return salesDone*100/totalStoreSales;
    }

    @Override
    public boolean checkPromotionEligibility() {
        boolean a;
        if(calculatePay()>50000){
            a = true;
        }
        else{
            a = false;
        }
        return a;    
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public double getSalesDone() {
        return salesDone;
    }

    public void setSalesDone(double salesDone) {
        this.salesDone = salesDone;
    }

    public double getTotalStoreSales() {
        return totalStoreSales;
    }

    public void setTotalStoreSales(double totalStoreSales) {
        this.totalStoreSales = totalStoreSales;
    }

    @Override
    public String toString() {
        return super.toString()+"Total Sales in store: $" + totalStoreSales 
                +"\nSales done: $"+ salesDone;
    }
    
    
    
}