/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.webscrap;

import java.io.*; 
import java.net.URL; 
import java.net.URLConnection;
import java.util.ArrayList;
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
    
    //This is where everything starts off
    public void setUp(String website) 
    {
        setHTML(website); //Get html source code
        wordBank = getText(wordBank, website); //Assign all the words scraped to an arrayList
    }
    
    //Clears the previous word bank for a new one.
    public void resetWordBank() 
    {
        wordBank.clear();
    }
    
     //A Setter to input the website link and convert to HTML and assign it to the variable
    public void setHTML(String link)
    {
        this.typingHTML = download(link);
    }
    
    //To re-organize all the text into proper format.
    public String printWords() 
    {
        StringBuilder sb = new StringBuilder(); //Creates string builder class 
        for(String s : wordBank) //formats every word and add a space between each one
        {
            sb.append(s);
            sb.append(" ");
        }
       return sb.toString(); //Return the text
    }
    
    //Get the wordCount of the text by getting size of ArrayList
    public int getWordCount() 
    {
        return wordBank.size();
    }
    
    //Scrapes the text off the website 
    public ArrayList getText(ArrayList<String> wordBank, String website) 
    {
        for(int i = 0; i <= getWordCount(website, typingHTML); i++)  //The words in the text is stored with a different key in the source code, so i need a loop
        {
            String key = "<span wordnr=\""+i+"\">"; //The key in the website is organized from 0-max, so we just replicate here with a loop as "i"
            int keyLocation = typingHTML.indexOf(key) + key.length(); //Gets the location at the end of the header
            int endLocation = typingHTML.indexOf("<",keyLocation); //Gets the location of the ending footer after the needed value
            String word = typingHTML.substring(keyLocation, endLocation); //Uses substring to get the value between the header index and footer index
            wordBank.add(word);
        }
        return wordBank;
    }
 
    //Calculate the word per minute and other stats
    public int[] evaluate(ArrayList<String> typedWords, double elapsedTimeInSeconds) 
    {
        int wrongWords = 0;
        int wordsTyped = 0;
        double totalChar = 0;
        final double avgChar = 3.5; //This is the average char per word that will be used in calculations
        
        for(int i = 1; i < typedWords.size(); i++) //Loops through each typedWords with the actual text and compare 
        {
            if(typedWords.get(i).equals(wordBank.get(i)))
            {
                wordsTyped++;
                totalChar += typedWords.get(i).length(); //Adds the total characters typed
            }
            else
            {
                wrongWords++;
                wordsTyped++;
            }
        }
        
        int correctWords = wordsTyped - wrongWords;
        int wpm = (int)(((totalChar/avgChar)/elapsedTimeInSeconds)*60); //Total characters / avg Char to find avg words typed and divide by time to find word per sec and multiply to 60 to find per minute
        int[] results = {wpm, wordsTyped, correctWords, wrongWords, (int)elapsedTimeInSeconds}; //Put all the stats into an array 
        
        return results;
    }

     //Gets the word count released on the website
    public int getWordCount(String website, String html)
    {
        String key = "<div class=\"pull-right\" style=\"text-align: right; border-right: 1px solid #ddd; padding-right: 10px;\">\n" +
"            <div style=\"margin-bottom: 2px;\"><span style=\"text-transform:uppercase;font-size:1.2em;font-weight:bold;\">";
        int keyLocation = html.indexOf(key) + key.length();
        int endLocation = html.indexOf("<",keyLocation);
        int words = Integer.parseInt((html.substring(keyLocation, endLocation)).trim())-1;
        
        return words; 
    }
    
    public String getRank(int wpm, int wrongWord) //Based on the WPM this gets the rank
   {
       String rank = "";
       if(wpm >= 130 && wrongWord == 0)
       {
           rank = "Grand Master";
       }
       else if(wpm >= 110 && wrongWord <= 1)
       {
           rank = "Master";
       }
       else if(wpm >= 100 && wrongWord <= 2)
       {
           rank = "Diamond";
       }
       else if(wpm >= 90)
       {
           rank = "Platinum";
       }
       else if(wpm >= 80)
       {
           rank = "Gold II";
       }
       else if(wpm >= 70)
       {
           rank = "Gold I";
       }
       else if(wpm >= 60)
       {
           rank = "Silver III";
       }
       else if(wpm >= 50)
       {
           rank = "Silver II";
       }
       else if(wpm >= 40)
       {
           rank = "Silver I";
       }
       else if(wpm >= 35)
       {
           rank = "Bronze III";
       }
       else if(wpm >= 30)
       {
           rank = "Bronze II";
       }
       else 
       {
           rank = "Bronze I";
       }
       return rank;
   }
    
    public String download(String website) //using the url it downloads the website source code
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