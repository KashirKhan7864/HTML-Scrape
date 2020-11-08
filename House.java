import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


public class House {
	
	private Map<String,Integer> cloud;
	
	private ArrayList<String> lines;
	
	public House(ArrayList<String> l)
	{
		lines = l;
		cloud = new HashMap<>();
		cloud.put("<h1>",10);
		cloud.put("<h2>",8);
		cloud.put("<h3>",6);
		cloud.put("<h4>",4);
		cloud.put("<h5>",2);
		cloud.put("<h6>",1);
		cloud.put("<p>", 1);
		cloud.put("<title>",10);
		cloud.put("<a href", 5);
		cloud.put("<li>", 1);
	}
	
	public ArrayList<String> getLines()
	{
		return lines;
	}
	
	public void printCloud()
	{
		 for (Map.Entry<String, Integer> entry : cloud.entrySet()) 
		 {
		        String k = entry.getKey();
		        Integer v = entry.getValue();
		        System.out.println("Key: " + k + ", Value: " + v);
		 }
	}
	
	public void assignValues()
	{
		for(String a: lines)
		{
			if(matchH1(a))
			{
				cloud.replace("<h1>", cloud.get("<h1>") + 1);
			}
			if(matchH4(a))
			{
				cloud.replace("<h4>", cloud.get("<h4>") + 1);
			}
		}
	}
	
	public Boolean matchH1(String x)
	{
		Pattern h1 = Pattern.compile("<?H1>([^<]*)</H1>");
		Matcher m = h1.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchH4(String x)
	{
		Pattern h1 = Pattern.compile("<?H4>([^<]*)</H4>");
		Matcher m = h1.matcher(x);
		Boolean check = m.find();
		return check;
	}

}
