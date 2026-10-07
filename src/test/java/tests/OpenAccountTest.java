package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountOverviewPage;
import pages.LoginPage;
import pages.OpenAccountPage;

public class OpenAccountTest extends BaseTest {

    @Test
    public void testOpenNewSavingAccount(){
        LoginPage loginPage = new LoginPage(driver, wait);
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage(driver, wait);
        OpenAccountPage openAccountPage= new OpenAccountPage(driver, wait);

        loginPage.enterusername("john");
        loginPage.enterpassword("demo");
        loginPage.clicklogin();

        accountOverviewPage.clickOpenNewAccount();

        openAccountPage.selectAccountType("SAVINGS");
        openAccountPage.clickOpenAccountButton();

        //Assertion
        Assert.assertTrue(openAccountPage.isNewAccountDisplayed(), "Account creation failed!");
    }
}
