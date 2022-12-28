/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q6 {

    public static void main(String[] args) {
        //Print out the header for the table
        System.out.printf("%-12s %-20s %15s %17s %10s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");

        try {
            //Declare scanner for reading from order.txt
            Scanner orderScanner = new Scanner(new FileInputStream("order.txt"));

            //While orderScanner still has next line (before end of file)
            while (orderScanner.hasNextLine()) {
                //Read the next line (order)
                String order = orderScanner.nextLine();
                //Split the order by comma ',' to get an array with all the info
                String[] orderInfo = order.split(",");

                //Saves the current order product id and order quantity int o a variable
                //Leaves other unknown variable blank (will search for it in product.txt)
                String productID = orderInfo[1];
                String productName = "";
                int orderQuantity = Integer.parseInt(orderInfo[2]);
                double pricePerUnit = 0;
                double totalPrice = 0;

                //Declare scanner to search from product.txt for the matching product id
                Scanner productScanner = new Scanner(new FileInputStream("product.txt"));

                //While productScanner still has next line (before end of file)
                while (productScanner.hasNextLine()) {
                    //Read the next line (product)
                    String product = productScanner.nextLine();
                    //Split the order by comma ',' to get an array with all the info
                    String[] productInfo = product.split(",");

                    //If productID from order matches the productID from product
                    if (productID.equals(productInfo[0])) {
                        //Obtain all the remaining missing information
                        productName = productInfo[1];
                        pricePerUnit = Double.parseDouble(productInfo[2]);
                        totalPrice = pricePerUnit * orderQuantity;

                        //Close the productScanner
                        productScanner.close();
                        break;
                    }
                }
                //Print out the obtained infromation from order.txt and product.txt
                System.out.printf("%-12s %-20s %15d %17.2f %10.2f\n", productID, productName, orderQuantity, pricePerUnit, totalPrice);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
