package Tests;

import Pages.RegisterPage;
import Pages.StartPage;
import org.testng.annotations.Test;

public class RegisterTest extends BasteTest {

    @Test
    public void register(){
        StartPage startPage = new StartPage(driver);
        startPage.Register();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.Register("Aya", "Hodaib","haram", "giza", "Egypt", "00000", "01004933015", "12345", "ayahodaib", "Test_2024","Test_2024");

    }
}
