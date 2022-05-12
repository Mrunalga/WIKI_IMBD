package TESTVAGRANTmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiPushpa {
	//All the WebElements from WIKI page
	WebDriver driver;
	public WikiPushpa(WebDriver driver) {
		this.driver=driver;
	}
	By DateWiki=By.xpath("//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]");
	public WebElement Wiki_date() {
		return driver.findElement(DateWiki);
	}
	
	By CountryWiki =By.xpath("//td[contains(text(),'India')]");
	public WebElement Wiki_Country() {
		return driver.findElement(CountryWiki);
		
		
	}

}
