package handsonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Handson {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "http://testleaf.herokuapp.com/pages/radio.html";
		driver.get(url);
		
		// checking radio button is selected or not
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		// selecting radio button
		WebElement selectRadio = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		Thread.sleep(3000);
		selectRadio.click();
	
	}

}
