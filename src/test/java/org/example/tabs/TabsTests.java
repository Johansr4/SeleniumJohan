package org.example.tabs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabsTests {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan0\\Desktop\\chromedriverJohan\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testExplicitWait() {
        driver.get("https://demoqa.com/dynamic-properties");

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
            driver.findElement(By.id("visibleAfter")).click();
            System.out.println("Button clicked");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
