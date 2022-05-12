package TESTVagrant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TESTVAGRANTmain.IMDPushpaelement;
import TESTVAGRANTmain.WikiPushpa;

public class Verify_Date_Country_Test  {
	//Extracting Date and Country from IMDB and WIKI
	@Test	
	void CompareDate_Country() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//Extracting date and country of IMDB
	IMDPushpaelement obj=new IMDPushpaelement(driver);	
    driver.get("https://www.imdb.com/title/tt9389998/");
     String DateIMBD=obj.Imdb_date().getText();
     String CountryIMBD=obj.Imdb_Country().getText();
    
   //Extracting date and country of wiki
   driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	WikiPushpa ok=new WikiPushpa(driver);
	String DateWIKI=ok.Wiki_date().getText();
	String CountryWIKI=ok.Wiki_Country().getText();
	
   //comparing date and country
	if(DateIMBD.equalsIgnoreCase(DateWIKI)) {
		System.out.println("Dates in the wiki and imdb are same");
	}
	else {
		System.out.println("Dates in the wiki and imdb are NOT same");
	}
	 
	
    if(CountryIMBD.equalsIgnoreCase(CountryWIKI)) {
		System.out.println("Country in the wiki and imdb are same");
	}
	else {
		System.out.println("Country in the wiki and imdb are NOT same");
	}
    driver.quit();
	 }
	}

