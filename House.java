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
		cloud.put("<ahref>", 5);
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
			if(matchH2(a))
			{
				cloud.replace("<h2>", cloud.get("<h2>") + 1);
			}
			if(matchH3(a))
			{
				cloud.replace("<h3>", cloud.get("<h3>") + 1);
			}
			if(matchH4(a))
			{
				cloud.replace("<h4>", cloud.get("<h4>") + 1);
			}
			if(matchH5(a))
			{
				cloud.replace("<h5>", cloud.get("<h5>") + 1);
			}
			if(matchH6(a))
			{
				cloud.replace("<h6>", cloud.get("<h6>") + 1);
			}
			if(matchP(a))
			{
				cloud.replace("<p>", cloud.get("<p>") + 1);
			}
			if(matchT(a))
			{
				cloud.replace("<title>", cloud.get("<title>") + 1);
			}
			if(matchahref(a))
			{
				cloud.replace("<ahref>", cloud.get("<ahref>") + 1);
			}
			if(matchli(a))
			{
				cloud.replace("<li>", cloud.get("<li>") + 1);
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
	
	public Boolean matchH2(String x)
	{
		Pattern h2 = Pattern.compile("<?H2>([^<]*)</H2>");
		Matcher m = h2.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchH3(String x)
	{
		Pattern h3 = Pattern.compile("<?H3>([^<]*)</H3>");
		Matcher m = h3.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchH4(String x)
	{
		Pattern h4 = Pattern.compile("<?H4>([^<]*)</H4>");
		Matcher m = h4.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchH5(String x)
	{
		Pattern h5 = Pattern.compile("<?H5>([^<]*)</H5>");
		Matcher m = h5.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchH6(String x)
	{
		Pattern h6 = Pattern.compile("<?H6>([^<]*)</H6>");
		Matcher m = h6.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchP(String x)
	{
		Pattern P = Pattern.compile("</P>");
		Matcher m = P.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchT(String x)
	{
		Pattern T = Pattern.compile("<TITLE>([^<]*)</TITLE>");
		Matcher m = T.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchahref(String x)
	{
		Pattern a = Pattern.compile("</A>");
		Matcher m = a.matcher(x);
		Boolean check = m.find();
		return check;
	}
	
	public Boolean matchli(String x)
	{
		Pattern li = Pattern.compile("<LI>");
		Matcher m = li.matcher(x);
		Boolean check = m.find();
		return check;
	}

}
