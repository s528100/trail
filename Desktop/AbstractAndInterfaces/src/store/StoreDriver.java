/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Shravani Alampalli
 */
public class StoreDriver {
    
   public static void main(String[] args) throws FileNotFoundException {

        int managerCount = 0;
        int salesAssociateCount = 0;

        PrintWriter write = new PrintWriter(new File("outputFile.txt"));

        Scanner scanner = new Scanner(new File("inputFile.txt"));

        ArrayList<Manager> managerList = new ArrayList<>();

        ArrayList<SalesAssociate> salesAssociateList = new ArrayList<>();

        while (scanner.hasNext()) {

            String employeeType = scanner.nextLine();

            String storeDetails = scanner.nextLine();

            String empName = scanner.nextLine();

            double basePay = scanner.nextDouble();

            double numberOfHoursWorked = scanner.nextDouble();

            double hourlyRate = scanner.nextDouble();

            if (employeeType.equals("Manager")) {
                double currentSales = scanner.nextDouble();
                double CurrentStoreSales = scanner.nextDouble();
                Manager manager = new Manager(CurrentStoreSales, currentSales, numberOfHoursWorked,
                        hourlyRate, storeDetails, basePay, empName);
                String str = scanner.nextLine();
                managerList.add(manager);

            } else {
                double salesRate = scanner.nextDouble();
                SalesAssociate salesAssociate = new SalesAssociate(salesRate, numberOfHoursWorked, hourlyRate, storeDetails, empName, basePay);
                salesAssociateList.add(salesAssociate);
                if (scanner.hasNext()) {
                    scanner.nextLine();
                }

            }

        }
        System.out.println("******************************************************");
        System.out.println("Number of employees working as MANAGER are: " + managerList.size());
        System.out.println("******************************************************");
        write.println("******************************************************");
        write.println("Number of employees working as MANAGER are: " + managerList.size());
        write.println("******************************************************");
        for (Manager manager : managerList) {
            managerCount++;
            System.out.println(managerCount + ". Manager Details:");
            System.out.println(manager);
            write.println(managerCount + ". Manager Details:");
            write.println(manager);
            System.out.println("Percentage of sales done: " + String.format("%.2f", manager.salesPercentByManager()) + "%");
            write.println("Percentage of sales done: " + String.format("%.2f", manager.salesPercentByManager()) + "%");
            System.out.println("Gross Payment: $" + String.format("%.1f", manager.calculatePay()));
            write.println("Gross Payment: $" + String.format("%.1f", manager.calculatePay()));
            System.out.println("Remaining store revenue: $" + manager.calculateRemainingStoreRevenue(manager.getTotalStoreSales()));
            write.println("Remaining store revenue: $" + manager.calculateRemainingStoreRevenue(manager.getTotalStoreSales()));

            System.out.print("Is " + manager.getEmployeeName() + " eligible for promotion? ");
            if (manager.checkPromotionEligibility() == true) {
                System.out.println("Yes, he is \n");
            } else {
                System.out.println("No, he needs to work harder\n");
            }

        }

        System.out.println("******************************************************");
        System.out.println("Number of employees working as SALES ASSOCIATES are: " + salesAssociateList.size());
        System.out.println("******************************************************");
        write.println("******************************************************");
        write.println("Number of employees working as SALES ASSOCIATES are: " + salesAssociateList.size());
        write.println("******************************************************");

        for (SalesAssociate salesAssociate : salesAssociateList) {
            salesAssociateCount++;
            System.out.println(salesAssociateCount + ". Sales Associate Details:");
            System.out.println(salesAssociate);
            write.println(salesAssociate);
            System.out.println("Total commission: $" + salesAssociate.calculateCommisssion());
            System.out.println("Gross Payment: $" + salesAssociate.calculatePay());

            write.println("Total commission: $" + salesAssociate.calculateCommisssion());
            write.println("Gross Payment: $" + salesAssociate.calculatePay());
            System.out.print("Is " + salesAssociate.getEmployeeName() + " eligible for promotion? ");
            if (salesAssociate.checkPromotionEligibility() == true) {
                System.out.println("Yes, he/she is eligible\n");
            } else {
                System.out.println("No, he/she needs to work harder\n");
            }

        }
        write.close();
    }
}