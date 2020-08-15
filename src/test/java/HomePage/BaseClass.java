package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

    void setup() {


        System.setProperty("webdriver.chrome.driver", "resources/Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salliemae.com/");
        driver.quit();
    }
}

