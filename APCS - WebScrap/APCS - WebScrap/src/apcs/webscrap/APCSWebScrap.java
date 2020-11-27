/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.webscrap;

import java.io.*; 
import java.net.URL; 
import java.net.URLConnection; 
import java.util.Scanner;

/**
 *
 * @author teevint.prak
 */
public class APCSWebScrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String website = "";
            String html = "";
            String username = "";
            String wpm = "";
            String lang = "";
            String OldUsername = "";
            int OldWpm = 0;
            Scanner s = new Scanner(System.in);
        while(true)
        {
            website = "https://10fastfingers.com/typing-test/english";
            html = download(website);
            String header = "[0] => Array";
            int foundAt = html.indexOf(header);
            int endsAt = html.indexOf("[1]", foundAt);

            String typerInfo = html.substring(foundAt, endsAt);
            //System.out.println(typerInfo);
            String key1 = "[username] => ";
            int usernameValue = typerInfo.indexOf(key1) + key1.length();
            int peEnd = typerInfo.indexOf("[", usernameValue);
            username = (typerInfo.substring(usernameValue, peEnd));

            String key2 = "[typing_test_url] => /typing-test/";
            int langValue = typerInfo.indexOf(key2) + key2.length();
            int peEnd2 = typerInfo.indexOf("[", langValue);
            lang = (typerInfo.substring(langValue, peEnd2));

            String key3 = "[wpm] => ";
            int wpmValue = typerInfo.indexOf(key3) + key3.length();
            int peEnd3 = typerInfo.indexOf(")", wpmValue);
            wpm = (typerInfo.substring(wpmValue, peEnd3));
            //int wpmInt = Integer.parseInt(wpm.trim());
            if(!(username.equals(OldUsername)))// && wpmInt >= OldWpm )
            {
                OldUsername = username;
                print(username, wpm, lang);
            }
 
        }
    }
    
    public static void print(String username, String wpm, String lang)
    {
         System.out.println(username.trim() + " is typing at " + wpm.trim() + " WPM in " + lang.trim());
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
