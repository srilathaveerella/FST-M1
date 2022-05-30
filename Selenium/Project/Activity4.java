package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class Activity4 {
    @Test
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        String title=driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]")).getText();
        System.out.println(title);
        Assert.assertEquals(title,"Email Marketing Strategies");
        driver.quit();
    }
}
