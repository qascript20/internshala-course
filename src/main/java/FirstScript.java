import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-email")).sendKeys("standard_user");
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-password")).sendKeys("secret_sauce");
        //driver.quit();
    }
}
