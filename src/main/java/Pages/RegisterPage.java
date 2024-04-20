package Pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    public  RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    private By FisrtName = By.id("customer.firstName");
    private By LastName = By.id("customer.lastName");
    private By Adress = By.id("customer.address.street");
    private By City = By.id("customer.address.city");
    private By State = By.id("customer.address.state");
    private By ZipCode = By.id("customer.address.zipCode");
    private By Phone = By.id("customer.phoneNumber");
    private By SSN = By.id("customer.ssn");
    private By UserName = By.id("customer.username");
    private By Password = By.id("customer.password");
    private By ConfirmPassword = By.id("repeatedPassword");
private By RegisterButton = By.xpath("(//input[@type='submit'])[2]");
    public void Register(String firstname, String lastname, String adress, String city, String state, String zipcode, String phone, String ssn, String username, String password, String confirmpassword){
        driver.findElement(FisrtName).sendKeys(firstname);
        driver.findElement(LastName).sendKeys(lastname);
        driver.findElement(Adress).sendKeys(adress);
        driver.findElement(City).sendKeys(city);
        driver.findElement(State).sendKeys(state);
        driver.findElement(ZipCode).sendKeys(zipcode);
        driver.findElement(Phone).sendKeys(phone);
        driver.findElement(SSN).sendKeys(ssn);
        driver.findElement(UserName).sendKeys(username);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
        driver.findElement(RegisterButton).click();
    }

    /*public void RegisterClick(){
        driver.findElement(RegisterButton).click();
    }*/
}

