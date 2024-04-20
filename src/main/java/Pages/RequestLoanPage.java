package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanPage {

    WebDriver driver;
    public RequestLoanPage(WebDriver driver){this.driver = driver;}

    private By LoanAmount = By.xpath("//input[@id='amount']");
    private By DownPayment = By.xpath("//input[@id='downPayment']");
    //private By FromAccount = By.xpath("//*[@id='fromAccountId']");
    private By ApplyBtn = By.xpath("//*[@value='Apply Now']");

    public void ApplyLoan(String amount, String payment, String from){
driver.findElement(LoanAmount).sendKeys(amount);
driver.findElement(DownPayment).sendKeys(payment);
driver.findElement(ApplyBtn).click();

    }
}
