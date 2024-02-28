package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan0\\Desktop\\chromedriverJohan\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
            driver.findElement(By.id("visibleAfter")).click();
            System.out.println("Button clicked");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
