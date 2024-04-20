package Tests;

import Pages.HomePage;
import Pages.LoginPage1;
import Pages.TransferFundsPage;
import org.testng.annotations.Test;

public class TransferFundsTest extends BasteTest{

    @Test
    public void TransferFunds() {

        new LoginPage1(driver).Login("ayahodaib40", "404040").ClickOnTransferFunds().ClickOnTransferFunds("500");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.Login("ayahodaib3", "Test_12345");
//        HomePage homePage = new HomePage(driver);
//        homePage.ClickOnTransferFunds();
//        TransferFundsPage transferFundsPage = new TransferFundsPage(driver);
//        transferFundsPage.ClickOnTransferFunds("500");
    }
}
