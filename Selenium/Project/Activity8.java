package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Activity8 {
    @Test
    public void openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
        driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Sneha");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sneha.c@ibm.com");
        driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']")).sendKeys("Compliant");
        driver.findElement(By.cssSelector("#wpforms-8-field_2")).sendKeys("Feedback");
        driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us! We will be in touch with')]")).getText());
    }

}
