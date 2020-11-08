import java.io.IOException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Tag Cloud Maker!");
        System.out.println();
        Scanner URLInput = new Scanner(System.in);
        System.out.print("Please type your URL:");
        String leURL = URLInput.nextLine();
        URLInput.close();
        Scrape scraper = new Scrape(leURL);
        House houser = new House(Scrape.getHTML());
        houser.assignValues();
        houser.printCloud();
	}

}
