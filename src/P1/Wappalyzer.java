package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wappalyzer {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@BeforeMethod
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com");
		driver.manage().window().maximize();
	}
	@Test
	public void testing() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[1]/header/div/div/div/div[2]/div[2]/div/div/div[1]/a/div")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span")).click();
		Thread.sleep(200);
	}
}
