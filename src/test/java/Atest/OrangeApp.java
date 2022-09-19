package Atest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeApp {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\LTA\\Drivers\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.s3india.com/");
        driver.findElement(By.xpath("//a[@href='hardware.html']")).click();
        driver.findElement(By.xpath("//a[@href='#lte-router']")).click();
	}

}
