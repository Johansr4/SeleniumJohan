package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan0\\Desktop\\chromedriverJohan\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        String username = "standard_user";
        String password = "secret_sauce";

        WebElement userInput = driver.findElement(By.id("user-name"));
        WebElement passInput = driver.findElement(By.id("password"));
        WebElement loginBut = driver.findElement(By.id("login-button"));

        userInput.sendKeys(username);
        passInput.sendKeys(password);
        loginBut.click();

        //WebElement userInputByName = driver.findElement(By.name("user-name"));
        //WebElement passInputByName = driver.findElement(By.name("password"));
        //WebElement loginButByName = driver.findElement(By.name("login-button"));

        //userInputByName.sendKeys(username);
        //passInputByName.sendKeys(password);
        //loginButByName.click();

        //WebElement userInputByXPath = driver.findElement(By.xpath("//input[@id='user-name']"));
        //WebElement passInputByXPath = driver.findElement(By.xpath("//input[@id='password']"));
        //WebElement loginButByXPath = driver.findElement(By.xpath("//input[@id='login-button']"));

        //userInputByXPath.sendKeys(username);
        //passInputByXPath.sendKeys(password);
        //loginButByXPath.click();

    }
}
