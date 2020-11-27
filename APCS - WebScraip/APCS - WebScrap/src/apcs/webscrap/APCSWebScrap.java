/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.webscrap;

import java.io.*; 
import java.net.URL; 
import java.net.URLConnection; 
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author teevint.prak
 */
public class APCSWebScrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
       setUp();
    }
    
    public static void setUp()
    {
        ArrayList<String> wordBank = new ArrayList();
        String website = "https://10fastfingers.com/text/239385-VS-Freddie";
        wordBank = getText(wordBank, website);
        print(wordBank);
    }
    public static void type(ArrayList<String> wordBank)
    { 
        String typedWords = "";
        double elaspedTimeInSeconds = 0.0;
        try
        {
            System.out.println(1);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(2);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(3);
            TimeUnit.SECONDS.sleep(1);
            
            double start = LocalTime.now().toNanoOfDay(); 
            Scanner input = new Scanner(System.in);
            System.out.println("");
            typedWords = input.nextLine();
            double end = LocalTime.now().toNanoOfDay(); 
            elaspedTimeInSeconds = (end - start)/1000000000.0;
        }
        catch(InterruptedException e)
        {
            
        }
        evaluate(typedWords, wordBank, elaspedTimeInSeconds);
    }   
    
    public static void evaluate(String typedWords, ArrayList<String> wordBank, double elapsedTimeInSeconds)
    {
        String[] inputWordArray = typedWords.split(" ");
        int wrongMatch = 0;
        int wordsTyped = 0;
        for(int i = 0; i < inputWordArray.length; i++)
        {
            if(inputWordArray[i].equals(wordBank.get(i+1)))
            {
                wordsTyped++;
                System.out.println(inputWordArray[i] + " and " + wordBank.get(i+1));
            }
            else
            {
                wrongMatch++;
                wordsTyped++;
                System.out.println(inputWordArray[i] + " and " + wordBank.get(i+1));
            }
        }
        int correctWords = wordsTyped - wrongMatch;
        int wpm = (int)((correctWords/elapsedTimeInSeconds)*60);
        
        System.out.print(wordsTyped + " words in " + elapsedTimeInSeconds);
        System.out.print(wpm + " WPM");
        System.out.print("Words Typed: " + wordsTyped + "| Correct Words: " + correctWords + "| Wrong Words: " + wrongMatch);
    }
    
    public static void print(ArrayList<String> wordBank)
    {
        for(int i = 0;i < wordBank.size()/10-1; i++)
        {
            System.out.println("");
            for(int j = 1;j <= 10; j++)
            {
                System.out.print(wordBank.get(j+(i*10)) + " ");
            }
        }
    }
    public static ArrayList getText(ArrayList<String> wordBank, String website)
    {
        String html = download(website);
        String firstWordKey = "<span class=\"current\"></span><span wordnr=\"0\" class=\"highlight\">";
        int firstWordKeyLocation = html.indexOf(firstWordKey) + firstWordKey.length();
        int firstWordEndLocation = html.indexOf("<",firstWordKeyLocation);
        String firstWord = html.substring(firstWordKeyLocation, firstWordEndLocation);
        System.out.println(firstWord);
        wordBank.add(firstWord);
        for(int i = 1; i <= getWordCount(website, html); i++)
        {
            String key = "<span wordnr=\""+i+"\">";
            System.out.println(key);
            int keyLocation = html.indexOf(key) + key.length();
            int endLocation = html.indexOf("<",keyLocation);
            String word = html.substring(keyLocation, endLocation);
            wordBank.add(word);
        }
        return wordBank;
    }
    
    public static int getWordCount(String website, String html)
    {
        String key = "<div class=\"pull-right\" style=\"text-align: right; border-right: 1px solid #ddd; padding-right: 10px;\">\n" +
"            <div style=\"margin-bottom: 2px;\"><span style=\"text-transform:uppercase;font-size:1.2em;font-weight:bold;\">";
        int keyLocation = html.indexOf(key) + key.length();
        int endLocation = html.indexOf("<",keyLocation);
        int words = Integer.parseInt((html.substring(keyLocation, endLocation)).trim());
        return words; 
    }
    
    
    
    public static String getTyperInfo(String website, String html)
    {
            html = download(website);
            String header = "[0] => Array";
            int foundAt = html.indexOf(header);
            int endsAt = html.indexOf("[1]", foundAt);
            String typerInfo = html.substring(foundAt, endsAt);
            
            return typerInfo;
    }
    
    public static String getUsername(String typerInfo, String username)
    {
            //System.out.println(typerInfo);
            String key1 = "[username] => ";
            int usernameValue = typerInfo.indexOf(key1) + key1.length();
            int peEnd = typerInfo.indexOf("[", usernameValue);
            username = (typerInfo.substring(usernameValue, peEnd));
            return username;
    }
    
    public static String getLang(String typerInfo, String lang)
    {
           String key2 = "[typing_test_url] => /typing-test/";
           int langValue = typerInfo.indexOf(key2) + key2.length();
           int peEnd2 = typerInfo.indexOf("[", langValue);
           lang = (typerInfo.substring(langValue, peEnd2));
           return lang;
    }
     
    public static int getWPM(String typerInfo, int wpm)
    {
           String key3 = "[wpm] => ";
           String wpmStr = Integer.toString(wpm);
           int wpmValue = typerInfo.indexOf(key3) + key3.length();
           int peEnd3 = typerInfo.indexOf(")", wpmValue);
           wpmStr = (typerInfo.substring(wpmValue, peEnd3));
           int wpmInt = Integer.parseInt(wpmStr.trim());
           return wpmInt;
    }
          
    public static void print(String username, String lang, int wpm)
    {
         System.out.println(username.trim() + " is typing at " + wpm + " WPM in " + lang.trim());
    }
    
    public static String returnStuff(String username, String lang, int wpm)
    {
        return username.trim() + " is typing at " + wpm + " WPM in " + lang.trim();
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
            System.out.println(e);//not much errzor handling but will print to console 
        } 
        return result.toString(); 

    } 

 
    
}
