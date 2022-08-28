package handsonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open leafGround webSite 
		String url = "http://testleaf.herokuapp.com/pages/checkbox.html";
		driver.get(url);
		
		// selecting programming language
		WebElement languageBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		languageBox.click();
		
		// disabling selected box
		WebElement confirmChecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean selectedOrNot = confirmChecked.isSelected();
		System.out.println(selectedOrNot);
		
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		
		if(unchecked.isSelected())
		{
			unchecked.click();
		}
		
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		
		if(checked.isSelected()) 
		{
			checked.click();
		}
	}

}
