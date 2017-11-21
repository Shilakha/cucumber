package cucumberTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\New folder\\Drivers\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
/*		   driver.get("https://www.eazework.com/login/");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@id='txtEmailAddress']")).sendKeys("evry");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@id='Login']")).sendKeys("shilakha");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys("Hello@123");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@value='Login']")).click();
		   //driver.switchTo().alert().accept();
		   Thread.sleep(9000);
		   driver.close();*/
		   
		   driver.get("http://172.20.21.219/HNM5/#/login?returnUrl=%2F");
		   System.out.println(driver.getPageSource());
}
}			
