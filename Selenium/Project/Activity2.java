package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {
    @Test
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
       String heading=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
       System.out.println(heading);
        Assert.assertEquals(heading, "Learn from Industry Experts");
        driver.quit();
    }
}
