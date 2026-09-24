package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() {
        LoginPage loginPage = new LoginPage(driver,wait);
        RegisterPage registerPage = new RegisterPage(driver, wait);

        loginPage.clickregister();

        String dynamicUsername = "Leila" + System.currentTimeMillis();
        registerPage.enterSignupInformation("leila", "lahmidi", " quartiier 123", "Agadir","souss massa",
                "80000", "056065604040", "333", dynamicUsername,"kjdfhm123", "kjdfhm123");
        registerPage.clickregisterbutton();

        String actualMessage = registerPage.getSuccessMessageText();
        Assert.assertTrue(actualMessage.contains("Your account was created successfully. You are now logged in."), "Registration failed!");







    }
}
