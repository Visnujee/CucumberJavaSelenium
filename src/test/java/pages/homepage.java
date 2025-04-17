package pages;

import dataProvider.ConfigFileReader;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;
import java.io.IOException;
import java.time.Duration;


public class homepage extends BrowserDriver{

    public void navigateHomepage() throws InterruptedException, IOException {
        ConfigFileReader configFileReader = new ConfigFileReader();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("config======================>");
        System.out.println("config======================>" + ConfigFileReader.getApplicationUrl());
//        driver.get(configFileReader.getApplicationUrl());
        //        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    public void forgotLink()throws InterruptedException {
        driver.findElement(By.xpath("//div[@class =\"forgot-link\"]")).click();
    }

        public void forgotPasswordPage()throws InterruptedException{
        Assert.assertEquals("Password help assistance", driver.getTitle());
    }

}

