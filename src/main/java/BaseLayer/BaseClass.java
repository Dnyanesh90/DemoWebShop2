package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;	
//	public static Properties prop;
//
//	public BaseClass() {
//		prop = new Properties();
//
//		try {
//			FileInputStream fis = new FileInputStream(
//					"C:\\Users\\kadam\\eclipse-workspace2\\DemoWebShop\\DemoWebShop\\src\\main\\java\\Configuration\\Config.properties");
//			prop.load(fis);
//		} catch (Exception e) {
//
//		}
//	}
	public static void inilization() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		//driver.get(prop.getProperty("url"));
		driver.get("http://demowebshop.tricentis.com/");
	}

}
