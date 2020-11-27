/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StonksApp;

/**
 *
 * @author blank
 */

import java.io.BufferedInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.math.BigDecimal; 
import java.net.URL; 
import java.util.Calendar; 
import java.util.logging.Level; 
import java.util.Scanner;
import yahoofinance.*; 
public class StonksCalculator {
    
    public static String getInfo()
    {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Please type in the stock name");
        String nameStock = scan.nextLine();
        
        return nameStock;
    }
    
    public static void main(String[] args)
    { 
        int i;
        i = 1;
        while(i == 1)
        {
            String stockName = getInfo();
            if("stop".equals(stockName))
            {
                break;
            } 
            else
            {
                System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "OFF"); 
                try 
                { 
                    Stock stock = YahooFinance.get(stockName); 
                    System.out.println(stock.getQuote()); 
                } 

                catch(Exception e){}
            }
            
        }
        
        
    }
    
}
