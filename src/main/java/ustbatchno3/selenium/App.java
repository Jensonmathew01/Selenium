package ustbatchno3.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App
{
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            String url = " https://www.instagram.com/";
            driver.get(url);
        }
}
