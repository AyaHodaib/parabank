package Tests;

import Pages.BillPayPage;
import Pages.HomePage;
import Pages.LoginPage1;
import org.testng.annotations.Test;

public class BillPayTest extends BasteTest {

    @Test
    public void BillPayment() {

        new LoginPage1(driver).Login("ayahodaib40", "404040").ClickOnBillBtn().ClickOnSendPaymentBtn("Aya","haram", "Egypt", "Giza", "00000","01004933015","23234", "23234", "500");

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.Login("ayahodaib3", "Test_12345");
//        HomePage homePage = new HomePage(driver);
//        homePage.ClickOnBillBtn();
//        BillPayPage billPayPage = new BillPayPage(driver);
//        billPayPage.ClickOnSendPaymentBtn("Aya","haram", "Egypt", "Giza", "00000","01004933015","23234", "23234", "500");
    }
}