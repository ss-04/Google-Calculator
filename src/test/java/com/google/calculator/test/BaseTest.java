package com.google.calculator.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    protected WebDriver driver;

    // Set up WebDriver before each test
    @Before
    public void setup() {
        // Set the system property for ChromeDriver if necessary (you can also use WebDriverManager if preferred)
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");

        // Set Chrome options (optional but recommended for headless or debugging)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--disable-gpu");

        // Initialize the WebDriver instance
        driver = new ChromeDriver(options);
    }

    // Tear down WebDriver after each test
    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
            driver.close();// Close the browser after the test
        }
    }
    
    public WebDriver getDriver() {
        return driver;
    }
}
