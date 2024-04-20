package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }




    private By openNewAccount = By.xpath("//*[text()='Open New Account']");
    private By BillPayBtn = By.xpath("//*[text()='Bill Pay']");
    private By TransferFunds = By.xpath("//*[text()='Transfer Funds']");
    private By RequestLoan = By.xpath("//*[text()='Request Loan']");
    private By UpdateContactInfo = By.xpath("//*[text()='Update Contact Info']");
    public OpenNewAccountPage OpenNewAccount(){
        driver.findElement(openNewAccount).click();
        return new OpenNewAccountPage(driver);
    }
    public BillPayPage ClickOnBillBtn(){driver.findElement(BillPayBtn).click();
    return new BillPayPage(driver);}
    public TransferFundsPage ClickOnTransferFunds(){driver.findElement(TransferFunds).click();
    return new TransferFundsPage(driver);}
    public RequestLoanPage ClickOnRequestLoan(){driver.findElement(RequestLoan).click();
    return new RequestLoanPage(driver);}
    public UpdateContactInfoPage ClickOnUpdateContactInfo(){driver.findElement(UpdateContactInfo).click();
    return new UpdateContactInfoPage(driver);}



}

