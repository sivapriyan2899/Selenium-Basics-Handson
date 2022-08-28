package handsonSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handson {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "http://testleaf.herokuapp.com/pages/Alert.html";
		driver.get(url);
		
		// accepting alert
		WebElement alertAccept = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertAccept.click();
		Thread.sleep(3000);
		Alert normalAlert = driver.switchTo().alert();
		normalAlert.accept();
		
		// canceling alert
		WebElement alertCancel = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		alertCancel.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		// Prompt Box
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Naan thaan siva");
		Thread.sleep(3000);
		promptAlert.accept();
		
		
		
	}

}
