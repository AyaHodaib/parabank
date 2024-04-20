package Tests;

import Pages.LoginPage1;
import org.testng.annotations.Test;

public class LoginTest extends BasteTest {

    @Test
    public void login(){
     new LoginPage1(driver).Login("ayahodaib30", "303030");
    }
}
