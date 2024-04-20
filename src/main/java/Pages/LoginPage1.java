package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {

WebDriver driver;
        public LoginPage1(WebDriver driver){
            this.driver = driver;
        }

        private By Username = By.xpath("//input[@name='username']");
        private By Password = By.xpath("//input[@name='password']");
        private By LoginBtn = By.xpath("//input[@type='submit']");

        public  HomePage Login (String username, String password){
            driver.findElement(Username).sendKeys(username);
            driver.findElement(Password).sendKeys(password);
            driver.findElement(LoginBtn).click();
            return  new HomePage(driver);
        }
    }


