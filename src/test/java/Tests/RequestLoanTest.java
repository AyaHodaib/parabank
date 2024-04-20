package Tests;

import Pages.HomePage;
import Pages.LoginPage1;
import Pages.RequestLoanPage;
import org.testng.annotations.Test;

public class RequestLoanTest extends BasteTest {

    @Test
    public void RequestLoan() {

        new LoginPage1(driver).Login("ayahodaib40", "404040").ClickOnRequestLoan().ApplyLoan("500", "50", "12345");

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.Login("zeftetlteen", "12345");
//        HomePage homePage = new HomePage(driver);
//        homePage.ClickOnRequestLoan();
//        RequestLoanPage requestLoanPage = new RequestLoanPage(driver);
//        requestLoanPage.ApplyLoan("500", "50", "12345");
//}
    }
}
