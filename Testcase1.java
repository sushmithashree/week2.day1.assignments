package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	public static void main(String[]args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sushmitha");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Thangavel");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title is \t"+driver.getTitle());
		driver.close();

}
}
