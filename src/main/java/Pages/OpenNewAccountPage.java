package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccountPage {

    WebDriver driver;
    public OpenNewAccountPage(WebDriver driver){this.driver =driver;}

    private By OpenNewAccountBtn = By.xpath("//input[@value='Open New Account']");

    public HomePage ClickOnOpenNewAccount() {
        driver.findElement(OpenNewAccountBtn).click();
        return new HomePage(driver);
    }
}
