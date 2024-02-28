package org.example.dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://demoqa.com/droppable/";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan0\\Desktop\\chromedriverJohan\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(from, to).perform();

    }
}
