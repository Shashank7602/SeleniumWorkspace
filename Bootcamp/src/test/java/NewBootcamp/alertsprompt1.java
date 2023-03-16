package NewBootcamp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsprompt1 {

	public static void main(String[] args) {
		 ChromeOptions option = new ChromeOptions();
		    option.addArguments("--remote-allow-origins=*");
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver(option);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    
		    
		    // open Url
		    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		    driver.manage().window().maximize();  
		    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		    
		    Alert alertwindow = driver.switchTo().alert();
		    alertwindow.sendKeys("welcome");
		    
		    System.out.println(alertwindow.getText());
		    alertwindow.accept();
		    //alertwindow.dismiss();
		    
		    String acttext = driver.findElement(By.xpath("//p[@id='result']")).getText();
		    String text = "You entered: welcome";
		    System.out.println(acttext);
		    System.out.println(text);
		    if (acttext.equals(text)) {
		    	System.out.println("Test Passed");
		    }
		    else {
		    	System.out.println("TEst failed");
		    }
	
	}

}