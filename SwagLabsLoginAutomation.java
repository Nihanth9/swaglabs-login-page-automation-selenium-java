package GitHub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginAutomation {
public static void main(String[] args) {
	
	//Launch the browser
	WebDriver driver = new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Wait statement
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
	//Navigate to the Application
	driver.get("https://www.saucedemo.com/");
	
	//Identify the User Name and Password Text fields
	WebElement username=driver.findElement(By.id("user-name"));
	WebElement password=driver.findElement(By.id("password"));
	
	//Identify the Login button
	WebElement loginButton=driver.findElement(By.cssSelector("input[id='login-button']"));
	
	//Enter valid Login Credentials
	username.sendKeys("standard_user");
	password.sendKeys("secret_sauce");
	
	//Click on Login button
	loginButton.click();
	
	//Verify the page
	String expectedURL= "https://www.saucedemo.com/inventory.html";
	String actualURL=driver.getCurrentUrl();
	if (expectedURL.equalsIgnoreCase(actualURL)) {
		System.out.println("Login Successful");
	} else {
		System.out.println("Login failed");
	}
	
	
	
}
}
