import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Scrape {
	
	public static ArrayList<String> HTML;
	
	private static URL myURL;
	
	public Scrape(String urL) throws IOException
	{
		 myURL = new URL(urL);
	     HTML = new ArrayList<String>();
	     try (var br = new BufferedReader(new InputStreamReader(myURL.openStream()))) 
	     {
	         String line;
	         StringBuilder sb = new StringBuilder();
	         while ((line = br.readLine()) != null) 
	           {
	               HTML.add(line);
	           }
	         System.out.println(sb);
	     }
    }
	
	public static void printHTML()
	{
		for(String html: HTML)
		{
			System.out.println(html);
		}
	}
	
	public static ArrayList<String> getHTML()
	{
		return HTML;
	}
}
