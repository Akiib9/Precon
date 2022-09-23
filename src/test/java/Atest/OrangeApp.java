package Atest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeApp {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\LTA\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aquibshaikh700@gmail.com");
		driver.findElement(By.xpath("//button[@jscontroller='soHxf']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akeeb@786#786");
		driver.findElement(By.xpath("//button[@jsname='LgbsSe']")).click();
		driver.findElement(By.xpath("//input[@id=':wi\" class=\"agP aFw']")).sendKeys("sharifshaikh7pp@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("My first tesing");
		driver.findElement(By.xpath("//div[@id=':rr']")).click();
		
	}

}
