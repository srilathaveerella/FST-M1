package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 {
    @Test
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
        List<WebElement> courses=driver.findElements(By.xpath("//a[@class='btn btn-primary']"));
        System.out.println(courses.size());
    }

}
