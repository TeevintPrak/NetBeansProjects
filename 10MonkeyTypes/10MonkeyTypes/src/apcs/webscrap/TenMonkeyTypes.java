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
public class TenMonkeyTypes {

    /**
     * @param args the command line arguments
     */
    
    private String typingHTML; //This is the variable that stores the source code of the website
    private ArrayList<String> wordBank = new ArrayList(); //The text scraped from the website will be stored in this list
    
    public static void main(String[] args) 
    {
        
    }
    
    public void resetWordBank() //Clears the previous word bank for a new one.
    {
        wordBank.clear();
    }
    
    public void setHTML(String link) //A Setter to input the website link and convert to HTML and assign it to the variable
    {
        this.typingHTML = download(link);
    }
    
    public void setUp(String website) //This is where everything starts off
    {
        setHTML(website); //Get html source code
        wordBank = getText(wordBank, website); //Assign all the words scraped to an arrayList
    }
    
    public String printWords() //To re-organize all the text into proper format.
    {
        StringBuilder sb = new StringBuilder(); //Creates string builder class 
        for (String s : wordBank) //formats every word and add a space between each one
        {
            sb.append(s);
            sb.append(" ");
        }
       return sb.toString(); //Return the text
    }
    
    public int getWordCount() //Get the wordCount of the text by getting size of ArrayList
    {
        return wordBank.size();
    }
    
    public ArrayList getText(ArrayList<String> wordBank, String website) //Scrapes the text off the website 
    {
        for(int i = 0; i <= getWordCount(website, typingHTML); i++)  //The words in the text is stored with a different key in the source code, so i need a loop
        {
            String key = "<span wordnr=\""+i+"\">"; //It is organize as such that it put each words in order from 0 - wordCount
            int keyLocation = typingHTML.indexOf(key) + key.length(); //Gets the location of the header to the end of the header
            int endLocation = typingHTML.indexOf("<",keyLocation); //Gets the location of the ending footer after the value
            String word = typingHTML.substring(keyLocation, endLocation); //Uses substring to get the value between the header index and footer index
            wordBank.add(word);
        }
        return wordBank;
    }
 
    public int[] evaluate(ArrayList<String> typedWords, double elapsedTimeInSeconds)
    {
        int wrongWords = 0;
        int wordsTyped = 0;
        double totalChar = 0;
        final double avgChar = 3.5;
        for(int i = 1; i < typedWords.size(); i++)
        {
            if(typedWords.get(i).equals(wordBank.get(i)))
            {
                wordsTyped++;
                totalChar += typedWords.get(i).length();
                System.out.println(totalChar);
            }
            else
            {
                wrongWords++;
                wordsTyped++;
            }
        }
        int correctWords = wordsTyped - wrongWords;
        System.out.println(totalChar);
        int wpm = (int)(((totalChar/avgChar)/elapsedTimeInSeconds)*60);
        int[] results = {wpm, wordsTyped, correctWords, wrongWords, (int)elapsedTimeInSeconds};
        return results;
    }

    public int getWordCount(String website, String html)
    {
        String key = "<div class=\"pull-right\" style=\"text-align: right; border-right: 1px solid #ddd; padding-right: 10px;\">\n" +
"            <div style=\"margin-bottom: 2px;\"><span style=\"text-transform:uppercase;font-size:1.2em;font-weight:bold;\">";
        int keyLocation = html.indexOf(key) + key.length();
        int endLocation = html.indexOf("<",keyLocation);
        int words = Integer.parseInt((html.substring(keyLocation, endLocation)).trim())-1;
        
        return words; 
    }
    
    
    
    public String getTyperInfo(String website, String html)
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
     
    public int getWPM(String typerInfo, int wpm)
    {
           String key3 = "[wpm] => ";
           String wpmStr = Integer.toString(wpm);
           int wpmValue = typerInfo.indexOf(key3) + key3.length();
           int peEnd3 = typerInfo.indexOf(")", wpmValue);
           wpmStr = (typerInfo.substring(wpmValue, peEnd3));
           int wpmInt = Integer.parseInt(wpmStr.trim());
           return wpmInt;
    }
          
    public void print(String username, String lang, int wpm)
    {
         System.out.println(username.trim() + " is typing at " + wpm + " WPM in " + lang.trim());
    }
    
    public String returnStuff(String username, String lang, int wpm)
    {
        return username.trim() + " is typing at " + wpm + " WPM in " + lang.trim();
    }
    
    public String download(String website) 
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