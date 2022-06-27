package Week2.day1.Assign1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement UsernameElement = driver.findElement(By.id("username"));
		UsernameElement.sendKeys("DemoSalesManager");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		WebElement LoginElement = driver.findElement(By.className("decorativeSubmit"));
		LoginElement.click();
		WebElement Element1 = driver.findElement(By.linkText("CRM/SFA"));
		Element1.click();
		WebElement CreateAccount0 = driver.findElement(By.linkText("Accounts"));
		CreateAccount0.click();
		WebElement CreateAccount1 = driver.findElement(By.linkText("Create Account"));
		CreateAccount1.click();
		WebElement Accountname = driver.findElement(By.xpath("//*[@id='accountName']"));
		Accountname.sendKeys("Selenium Automation Tester2");
		WebElement Localname = driver.findElement(By.xpath("//input[@name='groupNameLocal']"));
		Localname.sendKeys("Man");
		WebElement sitename = driver.findElement(By.xpath("//input[@name='officeSiteName']"));
		sitename.sendKeys("Chennai");
		WebElement AnnualRevenue = driver.findElement(By.xpath("(//input[@class='inputBox'])[5]"));
		AnnualRevenue.sendKeys("50000");
		WebElement Industry1 = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dd11 =new Select(Industry1);
		dd11.selectByIndex(3);
		WebElement Ownership1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dd12 =new Select(Ownership1);
		dd12.selectByVisibleText("S-Corporation");
		WebElement Source1 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select dd13 =new Select(Source1);
		dd13.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingcampaign1 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select dd14 = new Select(marketingcampaign1);
		dd14.selectByIndex(6);
		WebElement State1 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select dd15 = new Select(State1);
		dd15.selectByValue("TX");
		WebElement Submit1 = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		Submit1.click();
	}
		
        }

