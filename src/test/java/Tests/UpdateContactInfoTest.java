package Tests;

import Pages.HomePage;
import Pages.LoginPage1;
import Pages.UpdateContactInfoPage;
import org.testng.annotations.Test;

public class UpdateContactInfoTest extends BasteTest{

    @Test
    public void UpdateContactInfo() {

        new LoginPage1(driver).Login("ayahodaib50", "505050").ClickOnUpdateContactInfo().ClickOnTUpdateInfo("Victoria");


    }
}
