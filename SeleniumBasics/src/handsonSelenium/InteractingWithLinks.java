package handsonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a")).click();
		
		driver.findElement(By.linkText("Hyper Link")).click();
		
	}

}
