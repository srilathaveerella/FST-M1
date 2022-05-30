package com.AppiumProject.mavenProject.Project;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {
	
	// Declare Android driver
	WebDriverWait wait;
    AndroidDriver<MobileElement> driver;
    
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "appiumClass");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
 
        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }
    
    @Test
    public void testSearchAppium() {
    	
    	driver.get("https://www.training-support.net/");
    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("about-link")));
    	String pageTitle = driver.findElementByXPath("//android.widget.TextView[@text='Training Support']").getText();
        System.out.println("Title on Homepage: " + pageTitle);
        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@content-desc='About Us']");
        aboutButton.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='About Us']")));
 
        String newPageTitle = driver.findElementByXPath("//android.widget.TextView[@text='About Us']").getText();
        System.out.println("Title on new page: " + newPageTitle);
 
        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
        
    }
 
    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }    

}
