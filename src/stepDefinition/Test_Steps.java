package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public WebDriver driver;

	@Given("^user navigates to https://www.eazework.com/login/$")
	public void user_navigates_to_https_www_eazework_com_login() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SOFTWARES\\New folder\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.eazework.com/login/");
		Thread.sleep(2000);
	}

	@When("^user logs in using shilakha as USER$")
	public void user_logs_in_using_shilakha_as_USER() throws Exception {
		driver.findElement(By.xpath(".//input[@id='txtEmailAddress']")).sendKeys("evry");
		driver.findElement(By.xpath(".//input[@id='Login']")).sendKeys("shilakha");
		Thread.sleep(2000);
	}

	@When("^password as \"([^\"]*)\"$")
	public void password_as_Hello(String arg1) throws Exception {
		driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys(arg1);
		Thread.sleep(2000);
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Exception {
		driver.findElement(By.xpath(".//input[@value='Login']")).click();
		Thread.sleep(1000);
	}

	@Then("^Message displayed Login Successfully$")
	public void then_Message_displayed_Login_Successfully() throws Exception {
		System.out.println("Login is done successfully");
		Thread.sleep(1000);
	}

//	@Given("^user navigates to https://evry\\.eazework\\.com/DashBoard/$")
//	public void user_navigates_to_https_evry_eazework_com_DashBoard() throws Exception {
//		Thread.sleep(9000);
//		driver.quit();
//	}

	
	@Then("^Message displayed logout successfully$")
	public void message_displayed_logout_successfully() throws Exception {
		try {
			Thread.sleep(9000);
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}