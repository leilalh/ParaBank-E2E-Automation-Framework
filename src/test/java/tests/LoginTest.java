package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountOverviewPage;
import pages.LoginPage;


public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver, wait);
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver, wait);

        loginPage.enterusername("john");
        loginPage.enterpassword("demo");
        loginPage.clicklogin();

        String actualTitle = accountOverviewPage.getPageTitleText();
        Assert.assertEquals(actualTitle, "Accounts Overview", "Login failed!");

    }
}
