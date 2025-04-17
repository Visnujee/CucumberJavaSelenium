package utility;

import org.junit.After;
import org.junit.Before;

public class Hooks {
    public static BrowserDriver driver;

    @Before
    public void setUp(){
        try {
            if (driver == null){
                driver = new BrowserDriver();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
