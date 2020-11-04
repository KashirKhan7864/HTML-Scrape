import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Scrape {
	
	public Map<String, Integer> cloud;
	
	private static ArrayList<String> HTML;
	
	private static URL myURL;
	
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("Welcome to the Tag Cloud Maker!");
        System.out.println();
        Scanner URLInput = new Scanner(System.in);
        System.out.print("Please type your URL:");
        String leURL = URLInput.nextLine();
        URLInput.close();
        myURL = new URL(leURL);
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
        System.out.print(HTML.get(0));
    }
	
	public static void printHTML()
	{
		for(String html: HTML)
		{
			System.out.println(html);
		}
	}
}
