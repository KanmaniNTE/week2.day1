package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//Find the user and enter the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find the password and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout =driver.findElement(By.className("decorativeSubmit"));

		String attribute = logout.getAttribute("Value");
		System.out.println(attribute);
		if(attribute.equalsIgnoreCase("Logout")) {
			System.out.println("Successfully logged in");
		}
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kanmani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NTE");
		//WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Select select = new Select(dropDown);
		//select.selectByVisibleText("Public Relations");
		//select.selectByVisible
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kannu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Test Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nte.kanmani31@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(State);
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		//String title = driver.getTitle();
		//System.out.println(title);
		//if(title.equals("View Lead | opentaps CRM")) {
		//	System.out.println("Lead Created Successfully");
		//}
        driver.findElement(By.linkText("Duplicate Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
        driver.findElement(By.className("smallSubmit")).click();
        String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.equals("View Lead | opentaps CRM")) {
			System.out.println("Lead Created Successfully");
		}
        
        
		}

	}


