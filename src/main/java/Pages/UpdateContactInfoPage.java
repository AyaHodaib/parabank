package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateContactInfoPage {
    WebDriver driver;
    public UpdateContactInfoPage(WebDriver driver){this.driver = driver;}

    private By FirstName = By.xpath("//*[@id='customer.firstName']");
    private By UpdateProfileBtn = By.xpath("//*[@value='Update Profile']");
    public void ClickOnTUpdateInfo(String firstname){
        driver.findElement(FirstName).clear();
        driver.findElement(FirstName).sendKeys(firstname);
        driver.findElement(UpdateProfileBtn).click();
    }
}
