package Tests;

import Pages.StartPage;
import org.testng.annotations.Test;

public class StartTest extends BasteTest{

    @Test
    public void registerBtn(){
        StartPage startPage = new StartPage(driver);
        startPage.Register();
    }

}
