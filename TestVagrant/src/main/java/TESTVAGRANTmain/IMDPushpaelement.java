package TESTVAGRANTmain;
     
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
     
public class IMDPushpaelement {
	//All the WebElements from IMBD page
	WebDriver driver;
	public IMDPushpaelement(WebDriver driver) {
		this.driver=driver;
	}
	
	By DateIMDB =	By.xpath("//a[contains(text(),'January 7, 2022 (United States)')]");
	public WebElement Imdb_date() {
		return driver.findElement(DateIMDB);
	}
	
	By CountryIMDB =	By.xpath("//a[contains(text(),'India')]");
	public WebElement Imdb_Country() {
		return driver.findElement(CountryIMDB);
		
		
	}
	 
	
}
