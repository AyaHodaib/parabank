package Tests;

import Pages.HomePage;
import Pages.LoginPage1;
import Pages.OpenNewAccountPage;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BasteTest{

    @Test
    public void openNewAccount() {

        new LoginPage1(driver).Login("ayahodaib30", "303030").OpenNewAccount().ClickOnOpenNewAccount();



    }
    }
