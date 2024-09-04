package mavendemo_pack.maven_demoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class maven_demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://stqatools.com/demo/Register.php");
		WebElement Name = Driver.findElement(By.id("name"));
		Name.sendKeys("Reshma");
		WebElement Address = Driver.findElement(By.id("address"));
		Address.sendKeys("SijiNivas");
		WebElement Gender = Driver.findElement(By.id("female"));
		Gender.click();
		WebElement Hobbies = Driver.findElement(By.xpath("//*[@id=\"traveling\"]"));
		WebElement Hobbiess = Driver.findElement(By.xpath("//*[@id=\"music\"]"));
		Hobbies.click();
		Hobbiess.click();
		Select Country = new Select(Driver.findElement(By.id("country")));
		//Country.selectByIndex(4);
		//Country.selectByValue("Australia");
		Country.selectByVisibleText("Australia");
		Select City = new Select(Driver.findElement(By.id("city")));
		//City.selectByIndex(7);
		//City.selectByValue("Melbourne");
		City.selectByVisibleText("Melbourne");
		WebElement DOB = Driver.findElement(By.id("dob"));
		DOB.sendKeys("05-30-1994");
		WebElement Submit = Driver.findElement(By.cssSelector("#registration-form > button"));
		Submit.click();
		//Driver.close();
		//Driver.quit();
			
	}

}
