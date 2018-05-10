import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		//count of the links in the entire page
		System.out.println(driver.findElement(By.tagName("a")).getSize());

	}

}
