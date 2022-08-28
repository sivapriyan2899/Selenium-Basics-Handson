package handsonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class InteractingWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://testleaf.herokuapp.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement buttonPage = driver.findElement(By.linkText("Button"));
		buttonPage.click();
		
		//1.Find button position
		WebElement buttonPosition = driver.findElement(By.id("position"));
		Point XYco_ordinates = buttonPosition.getLocation();
		int Xpoint = XYco_ordinates.getX();
		int Ypoint = XYco_ordinates.getY();
		System.out.println("Xco-ordinate is "+ Xpoint + " Yco-ordinate is "+ Ypoint);
		
		//2.Find button color
		WebElement buttonColor = driver.findElement(By.id("color"));
		String background_color = buttonColor.getCssValue("background-color");
		
		String hexValue = Color.fromString(background_color).asHex();
		
		System.out.println("Button color in "+background_color);
		System.out.println("Color in Hex value "+hexValue);
		
		//3.Finding button height and width
		WebElement buttonSize = driver.findElement(By.id("size"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		
		System.out.println("Heigt is "+height+ " width is "+width);
	}

}
