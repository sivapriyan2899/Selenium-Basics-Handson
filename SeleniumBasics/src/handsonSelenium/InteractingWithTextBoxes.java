package handsonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithTextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "http://testleaf.herokuapp.com/";
		driver.get(url);
		
		WebElement textBoxLink = driver.findElement(By.linkText("Edit"));
		textBoxLink.click();
		
		WebElement textBox = driver.findElement(By.id("email"));
		textBox.sendKeys("xxx@gmail.com");
		
		WebElement appendText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendText.sendKeys("im appended");
		
		WebElement retriveValue = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String value = retriveValue.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
		
	}

}
