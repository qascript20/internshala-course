package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocatorTextMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
        if(driver.findElement(By.xpath("//h1[text()='Shopping Cart']")).isDisplayed()){
            System.out.println("Shopping Cart Page is displayed");
        }
        else{
            System.out.println("Shopping Cart Page is not displayed");
        }
    }
}
