package NewBootcamp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragnddrop {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver(option);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    
	    
	    // open Url
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();

	    WebElement f1 = driver.findElement(By.xpath("//div[@id='box6']"));

	    WebElement f2 = driver.findElement(By.xpath("//div[@id='box106']"));


	    
	    Actions act = new Actions(driver);		    
	    //Mouse Hover		    
	    act.dragAndDrop(f1,f2).perform();
}
}
