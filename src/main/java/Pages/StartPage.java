package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    private WebDriver driver;
    public StartPage (WebDriver driver){
        this.driver = driver;
    }

    private By RegisterBtn = By.xpath("//*[text()='Register']");

    public void Register(){
        driver.findElement(RegisterBtn).click();
    }
}
