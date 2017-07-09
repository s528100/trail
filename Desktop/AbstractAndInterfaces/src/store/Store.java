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
public interface Store {
    
    static double COMMISSION_RATE = 0.10;
    static double TAX = 0.14;
    
    public double calculateCommisssion();
    public double calculateRemainingStoreRevenue(double storeSales);
        
    
    
    
}
