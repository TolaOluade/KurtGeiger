package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllDrivers {

    public static WebDriver driver;
    public void setDriver(String browser) {
        if (driver == null) {
            if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\AutomationDependencies\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\AutomationDependencies\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
    }

    public void tearDown(){
        driver.quit();
        driver=null;
    }

}
