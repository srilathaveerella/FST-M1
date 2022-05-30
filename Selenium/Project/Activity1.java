package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
    @Test
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        System.out.println("Page title is : " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");
        driver.quit();
    }
}
