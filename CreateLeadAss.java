package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAss {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Volante");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prabhakaran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RM");
		WebElement elem = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(elem);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prabha");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation tester with 5+ years of experience");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prabhakaranrm7@gmail.com");
		WebElement elem1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(elem1);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("The title is:" + driver.getTitle());
		
	    driver.close();

	}

}
