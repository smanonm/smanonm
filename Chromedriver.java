package Week2.day2;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Chromedriver {
		
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
WebElement UsernameElement = driver.findElement(By.id("username"));
UsernameElement.sendKeys("DemoSalesManager");
WebElement PasswordElement1 = driver.findElement(By.id("password"));
PasswordElement1.sendKeys("crmsfa");
WebElement LoginButton = driver.findElement(By.className("decorativeSubmit"));
LoginButton.click();
WebElement LoginButton1 = driver.findElement(By.linkText("CRM/SFA"));
LoginButton1.click();
WebElement Leadbutton = driver.findElement(By.linkText("Leads"));
Leadbutton.click();
WebElement CreateElement =driver.findElement(By.linkText("Create Lead"));
CreateElement.click();
WebElement CompanyNameElement =driver.findElement(By.id("createLeadForm_companyName"));
CompanyNameElement.sendKeys("ABC Org");
WebElement FirstName1 =driver.findElement(By.id("createLeadForm_firstName"));
FirstName1.sendKeys("Mano");
WebElement  elementSourceDropDown = driver.findElement(By.id(createLeadForm_dataSourceId));
Select dd =new Select(elementSourceDropDwon);
dd.selectByIndex(0);
WebElement CreateElement1 =driver.findElement(By.name("Submit"));
CreateElement1.click();


	}
	}
	

