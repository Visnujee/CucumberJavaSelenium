package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
    public static WebDriver driver;

    public BrowserDriver(){
        this.driver = driver;
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    public void close(){
        this.driver.close();
    }

}
