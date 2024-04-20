package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage {

    WebDriver driver;

    public TransferFundsPage(WebDriver driver){this.driver = driver;}

    private By Amount = By.xpath("//input[@name='input']");
    private By SubmitTransfer = By.xpath("//input[@value='Transfer']");

    public void ClickOnTransferFunds(String amount){
        driver.findElement(Amount).sendKeys(amount);
        driver.findElement(SubmitTransfer).click();
    }
}
