package handsonSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "http://testleaf.herokuapp.com/";
		driver.get(url);
		
		WebElement dropdownPage = driver.findElement(By.linkText("Drop down"));
		dropdownPage.click();
		
		// Select option using index number
		WebElement optionUsingIndex = driver.findElement(By.id("dropdown1"));
		Select selectByValue = new Select(optionUsingIndex);
		selectByValue.selectByIndex(2);
		
		// Select option using text
		WebElement optionUsingText = driver.findElement(By.name("dropdown2"));
		Select selectByText = new Select(optionUsingText);
		selectByText.selectByVisibleText("Appium");
		
		// Select option using value
	    WebElement optionUsingValue = driver.findElement(By.id("dropdown3"));
	    Select selectValue = new Select(optionUsingValue);
	    selectValue.selectByValue("2");
	    
	    // finding total options in the dropdown
	    WebElement allOption = driver.findElement(By.className("dropdown"));
	    Select selectAllOption = new Select(allOption);
	    List <WebElement> list = selectAllOption.getOptions();
	    int optionSize = list.size();
	    
	    System.out.println("total options are "+ optionSize);
	    
	    // selecting options using SendKeys
	    WebElement usingSendKeys = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	    usingSendKeys.sendKeys("Appium");
	    
	    // selecting multiple options
	    WebElement multipleOption = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	    Select selectMultiple = new Select(multipleOption);
	    
	    selectMultiple.selectByIndex(1);
	    selectMultiple.selectByIndex(2);
	    selectMultiple.selectByIndex(3);
	    	
	}

}
