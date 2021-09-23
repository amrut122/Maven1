package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover 
{
 
	@Test
	public void hover()
	{
    //System.setProperty("webdriver.chrome.driver", "F:\\Selenium Resources\\chromedriver_win32\\chromedriver.exe");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
            
    driver.manage().window().maximize();    
                
    
    
    //MouseHover
    
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    WebElement element = driver.findElement(By.id("mousehover"));
    
    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("window.scroll(0,1300)");
    
    Actions act = new Actions(driver);
    
    act.moveToElement(element).build().perform();
    
    
	}   
}
