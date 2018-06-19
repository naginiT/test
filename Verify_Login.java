package First_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Login 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","H:\\JarFiles\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    //Launch Browser
	    driver.get("https://www.google.co.in");
	    Thread.sleep(1000);
	    
	    /*//Inspect the UserName EditBox
	    driver.findElement(By.name("identifier")).sendKeys("ganesha5879");
	    Thread.sleep(1000);
	    
	    //Inspect the Next Button
	    driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
	    Thread.sleep(1000);
	    */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
