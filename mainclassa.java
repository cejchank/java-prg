/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */



import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;
/*******************************************************************************
 * Třída {@code mainclassa} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class mainclassa
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
      
        String filepath="testovani.txt";
        String filecoding="UTF-8";
        Scanner sc=new Scanner(System.in);
        System.out.println("Číst nebo přepsat?");
        String vyber=sc.next();
        
        if(vyber.equals("r"))
        {
        int wordcount=0;
        int linecount=0;
        int charcount=0;
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(filepath),filecoding));
        String line=null;
        while((line=reader.readLine())!=null)
        {
        charcount+=line.length();
        linecount++;
        StringTokenizer tokenizer=new StringTokenizer(line," \\u0009");
        wordcount+=tokenizer.countTokens();
        
        }
    reader.close();
    System.out.println(charcount);
    System.out.println(linecount);
    System.out.println(wordcount);
    }
    else if(vyber.equals("w"))
    {
        BufferedWriter Bwriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filepath),filecoding));
     Scanner sc2=new Scanner(System.in);
        System.out.println("Zadej text:");
    String text=sc2.next();
        
       Bwriter.write(text);
   Bwriter.close();
    }
    else
    {System.out.println("boom");}
   
    }
}
