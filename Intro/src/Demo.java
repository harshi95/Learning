import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		//invoke .exe first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());//validate if title is correct or not
		System.out.println(driver.getCurrentUrl());//validate if landed on current url
		System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); //recommened to close the test after execution-closes current window
		driver.quit(); //closes all windows opened my selenium 
	}

}
