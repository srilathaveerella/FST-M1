package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 {
    @Test
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        String Title = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]")).getText();
        System.out.println(Title);
        Assert.assertEquals(Title, "Actionable Training");
        driver.quit();
    }
}
