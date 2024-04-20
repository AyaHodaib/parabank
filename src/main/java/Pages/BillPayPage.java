package Pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage {

    WebDriver driver;

    public BillPayPage(WebDriver driver){this.driver = driver;}

    private By Payeename = By.xpath("//input[@name='payee.name']");
    private By Adress = By.xpath("//input[@name='payee.address.street']");
    private By City = By.xpath("//input[@name='payee.address.city']");
    private By State = By.xpath("//input[@name='payee.address.state']");
    private By ZipCode = By.xpath("//input[@name='payee.address.zipCode']");
    private By Phone = By.xpath("//input[@name='payee.phoneNumber']");
    private By Account = By.xpath("//input[@name='payee.accountNumber']");
    private By VerifyAccount = By.xpath("//input[@name='verifyAccount']");
    private By Amount = By.xpath("//input[@name='amount']");
    private By SendPaymentBtn = By.xpath("//input[@value='Send Payment']");

    public void ClickOnSendPaymentBtn(String payeename, String adress, String city, String state, String zipcode, String phone, String account, String verifyAccount, String amount){
        driver.findElement(Payeename).sendKeys(payeename);
        driver.findElement(Adress).sendKeys(adress);
        driver.findElement(City).sendKeys(city);
        driver.findElement(State).sendKeys(state);
        driver.findElement(ZipCode).sendKeys(zipcode);
        driver.findElement(Phone).sendKeys(phone);
        driver.findElement(Account).sendKeys(account);
        driver.findElement(VerifyAccount).sendKeys(verifyAccount);
        driver.findElement(Amount).sendKeys(amount);
        driver.findElement(SendPaymentBtn).click();
    }
}
