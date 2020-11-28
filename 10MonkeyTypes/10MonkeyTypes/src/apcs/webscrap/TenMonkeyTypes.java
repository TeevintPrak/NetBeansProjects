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
    private String typingHTML;
    public static void main(String[] args) 
    {
        // TODO code application logic here
       TenMonkeyTypes app = new TenMonkeyTypes();
       String website = "https://10fastfingers.com/text/239385-VS-Freddie";
       app.setUp(website);
    }
    
    public void setHTML(String link)
    {
        this.typingHTML = download(link);
    }
    
    public void setUp(String website)
    {
        ArrayList<String> wordBank = new ArrayList();
        setHTML(website);
        wordBank = getText(wordBank, website);
        
        print(wordBank);
    }
    
    public ArrayList getText(ArrayList<String> wordBank, String website)
    {
        wordBank.add(getFirstWord());
        for(int i = 0; i < getWordCount(website, typingHTML); i++)
        {
            String key = "<span wordnr=\""+i+"\">";
            int keyLocation = typingHTML.indexOf(key) + key.length();
            int endLocation = typingHTML.indexOf("<",keyLocation);
            String word = typingHTML.substring(keyLocation, endLocation);
            System.out.println(word + " " + i);
            wordBank.add(word);
            if((i+1) == getWordCount(website,typingHTML))
            {
                String key2 = "<span wordnr=\""+(getWordCount(website,typingHTML))+"\">";
                int keyLocation2 = typingHTML.indexOf(key2) + key2.length();
                int endLocation2 = typingHTML.indexOf(".&",keyLocation2);
                word = typingHTML.substring(keyLocation2, endLocation2);
                System.out.println(word + " " + getWordCount(website,typingHTML));
                wordBank.add(word);
            }
        }
        return wordBank;
    }
    
    public String getFirstWord()
    {
        String leftKey = "<div class=\"workspace\" id=\"row1\"><span class=\"current\"></span><span wordnr=\"0\">";
        int leftKeyIndex = (typingHTML.indexOf(leftKey) + leftKey.length());
        String rightKey = "</span> <span wordnr=\"1\">";
        int rightKeyIndex = typingHTML.indexOf(rightKey);
        String firstWord = typingHTML.substring(leftKeyIndex, rightKeyIndex);
        //System.out.println("This is first word" + firstWord);
        return firstWord;
    }
    
    public void type(ArrayList<String> wordBank)
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
    
    public void evaluate(String typedWords, ArrayList<String> wordBank, double elapsedTimeInSeconds)
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
    
    public void print(ArrayList<String> wordBank)
    {
        for(int i = 0;i < wordBank.size(); i++)
        {
            System.out.println(wordBank.get(i));
        }
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
