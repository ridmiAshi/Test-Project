package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\New project\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
		driver.get("https://mail.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("ridmiashincomp@gmail.com");
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierNext")));

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierNext")));
		driver.findElement(By.id("identifierNext")).click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

		driver.findElement(By.name("password")).sendKeys("123456@r");
		driver.findElement(By.id("passwordNext")).click();
	  
  }
}


