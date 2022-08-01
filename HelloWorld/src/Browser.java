import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	
	
	static WebDriver driver;
	 static void  getBrowser(String browser) throws InterruptedException {
		switch (browser) {
		case "chrome":
			System.setProperty("Webdriver.chrome.driver", "./browsers/chromedriver.exe");
			driver = new ChromeDriver();
			
		case "edge":
			System.setProperty("Webdriver.edge.driver", "./browsers/edgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser");
			break;
		}
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		getBrowser("chrome");
		
	}

}
