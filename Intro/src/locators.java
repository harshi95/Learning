
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		//invoke .exe first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my code");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		driver.get("https://facebook.com/");
		//driver.findElement(By.name("pw")).sendKeys("jdhfk");
		//driver.findElement(By.className("input r4 wide mb16 mt8 username")).click();
		//driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("harshithagirish95@gmail.com");
		driver.findElement(By.cssSelector("div#error.loginError")).getText();
	}//cursor moves to email tab
}
