/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.to.apcs;

import java.io.*; 
import java.net.URL; 
import java.net.URLConnection; 
import java.util.Scanner;
/**
 *
 * @author Dexte
 */
public class ExtentionToAPCS
{

    /**
     * @param args the command line arguments
     */
   
        public static String[] getInfo(String link)
        {
            String webpage = download(link);
            String[] arrayOfPrices = new String[8];
            arrayOfPrices[0] = getPrice(webpage, "cpu");
            arrayOfPrices[1] = getPrice(link, "motherboard");
            
            try 
            {
                arrayOfPrices[2] = getPrice(link, "cpu-cooler");
            } 
            catch(Exception e) 
            {
                arrayOfPrices[2] = "0";
            }
            
            arrayOfPrices[3] = getPrice(link, "internal-hard-drive");
            arrayOfPrices[4] = getPrice(link, "video-card");
            arrayOfPrices[5] = getPrice(link, "case");
            arrayOfPrices[6] = getPrice(link, "power-supply");
            arrayOfPrices[7] = getTotalPrice(link); 
            return arrayOfPrices;
        }
        public static String getPrice(String webpage, String products)
        {
            int keyIndex =	webpage.indexOf("<td class=\"td__component\">\n" +
                                        "<a href=\"/products/"+products+"/\">");
            int basePriceKey = webpage.indexOf("$", keyIndex);
            int realPriceStart = webpage.indexOf("$", basePriceKey);
            int realPriceEnd = webpage.indexOf("<",realPriceStart); 

            String realPrice = webpage.substring(realPriceStart, realPriceEnd);
            return realPrice;
        }
        public static String getTotalPrice(String webpage)
        {
            String key = "<tr class=\"tr__total tr__total--final\">\n" +
                                        "<td class=\"td__label\" colspan=\"8\">Total:</td>\n" +
                                        "<td class=\"td__price\">";
            int keyIndex = webpage.indexOf(key);
            int realPriceEnd = webpage.indexOf("<",keyIndex + key.length()); 
            String realPrice = webpage.substring(keyIndex + key.length(), realPriceEnd);
            return realPrice;
        }
        
        
        public static void main(String[] args)
    {
    /*System.out.println("Please enter the PcPartPicker Build Link: "); 
    //https://ca.pcpartpicker.com/list/QJGbK3
    Scanner s = new Scanner(System.in);
    String link = s.nextLine();
    String webpage = download(link);
    System.out.println(getTotalPrice(webpage)); */
    
    }
        
       public static String download(String website) 
       { 
        StringBuilder result = new StringBuilder(); 
        String line; 
        try 
        { 
            URLConnection urlConnection = new URL(website).openConnection(); 
            String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36"; 
            urlConnection.addRequestProperty("User-Agent", userAgent); 
            urlConnection.setReadTimeout(5000); 
            urlConnection.setConnectTimeout(5000); 
            InputStream is = urlConnection.getInputStream(); 
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
            
            while ((line = br.readLine()) != null)  
            { 
                result.append(line+"\n"); 
            } 
        }      
        catch(Exception e)
        { 
            System.out.println(e);//not much error handling but will print to console 
        } 
        return result.toString(); 
    } 
}
