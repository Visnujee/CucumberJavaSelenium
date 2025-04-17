package pages;

import dataProvider.ConfigFileReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static utility.BrowserDriver.driver;


public class homepage extends BrowserDriver{
        public void navigateHomepage() throws InterruptedException, IOException {

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
          driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

    }
    public void forgotLink()throws InterruptedException {
        driver.findElement(By.xpath("//div[@class =\"forgot-link\"]")).click();

    }

        public void forgotPasswordPage()throws InterruptedException{
        Assert.assertEquals("Password help assistance", driver.getTitle());
    }

}

