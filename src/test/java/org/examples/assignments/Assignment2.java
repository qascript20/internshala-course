package org.examples.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Assignment2 {

    public static void main(String[] args) {

        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(firefoxBinary);
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://gmail.com");
        String title = driver.getTitle();
        if(title.equals("Gmail")){
            System.out.println("Title is correct");
        }
        else{
            System.out.println("Title is incorrect");
        }

    }
}
