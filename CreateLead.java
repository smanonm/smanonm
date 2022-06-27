package Week2.day1.Assign1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
		WebElement Lead1 = driver.findElement(By.linkText("Leads"));
		Lead1.click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		WebElement CompanyName1 = driver.findElement(By.xpath("//input[@class='inputBox']"));
		CompanyName1.sendKeys("Mano company");
		WebElement FirstName1 = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		FirstName1.sendKeys("MMM1");
		WebElement LastName1 = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		LastName1.sendKeys("MMM2");
		WebElement Source1 = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select dd13 =new Select(Source1);
		dd13.selectByVisibleText("Employee");
		WebElement marketingcampaign1 = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select dd14 = new Select(marketingcampaign1);
		dd14.selectByValue("9001");
		WebElement Industry1 = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dd11 =new Select(Industry1);
		int size = 16;
		dd11.selectByIndex(size-1);
		WebElement Ownership1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dd12 =new Select(Ownership1);
		dd12.selectByIndex(5);
		WebElement State1 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select dd15 = new Select(State1);
		dd15.selectByVisibleText("Indiana");
		WebElement Submit1 = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		Submit1.click();
		WebElement PageName1 = driver.findElement(By.xpath("//*[@id=\"ext-gen614\"]"));
		String s= PageName1.getText();
	      System.out.println("Text content is : " + s);
		
}
}