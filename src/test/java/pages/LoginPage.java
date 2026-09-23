package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;


    By username = By.cssSelector("input[name='username']");
    By password = By.cssSelector("input[name='password']");
    By login = By.cssSelector("input[value='Log In']");
    By register = By.linkText("Register");

    public LoginPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void enterusername(String username1){
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(username1);
    }
    public void enterpassword(String password1){
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(password1);
    }

    public void clicklogin(){
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }
    public void clickregister(){
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
    }


}
