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
public class SalesAssociate extends AbstractStoreEmployee{
    
    private double salesRate;

    public SalesAssociate(double salesRate ,double numberOfHoursWorked,  double hourlyRate,String storeDetails, String name, double basePay) {
        super(basePay, name, hourlyRate, numberOfHoursWorked, storeDetails);
        this.salesRate = salesRate;
    }

    @Override
    public double calculatePay() {
        return super.getBasePay()+ calculateCommisssion()+
                (super.getNumberOfHoursWorked()*super.getHourlyRate());
    }
    
    @Override
    public double calculateCommisssion(){
        if(getSalesRate() > 30) {
            return super.getBasePay() * COMMISSION_RATE;
        }
        else {
            return 0.00;
        }
        
    }

    @Override
    public boolean checkPromotionEligibility() {
         boolean a;
        if(calculatePay()>25000){
            a = true;
        }
        else{
            a = false;
        }
        return a; 
    }

    public double getSalesRate() {
        return salesRate * 100;
    }

    @Override
    public String toString() {
        return super.toString()+ "Sales Rate: " + getSalesRate() + "%" ;
    }
    
    
    
}
