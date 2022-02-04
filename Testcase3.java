package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {
	public static void main(String[]args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sushmitha");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Thangavel");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("16/01/1998");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0422");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("065");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7598550865");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tharani");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sushmitha");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Alexa");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("18/1,Sri Valli Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Avarampalayam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641006");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("05");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		

}
}
