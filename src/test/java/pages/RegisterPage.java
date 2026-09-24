package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By firstname = By.cssSelector("input[name='customer.firstName']");
    private By lastname = By.cssSelector("input[name='customer.lastName']");
    private By address = By.cssSelector("input[name='customer.address.street']");
    private By city = By.cssSelector("input[name='customer.address.city']");
    private By state = By.cssSelector("input[name='customer.address.state']");
    private By zipecode = By.cssSelector("input[name='customer.address.zipCode']");
    private By phone = By.cssSelector("input[name='customer.phoneNumber']");
    private By SSN = By.cssSelector("input[name='customer.ssn']");
    private By usernamesignup = By.cssSelector("input[name='customer.username']");
    private By passwordsignup = By.cssSelector("input[name='customer.password']");
    private By confirmpassword = By.cssSelector("input[name='repeatedPassword']");
    private By registerbutton =  By.cssSelector("input[value='Register']");
    private By sucessMessage = By.cssSelector("div#rightPanel p");

    public RegisterPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public  void enterSignupInformation(String fname, String lname, String saddress, String scity, String sstate,
                                        String szipecode, String sphone, String sSSN, String susername,
                                        String spassword, String sconfirmedpassword){


        wait.until(ExpectedConditions.visibilityOfElementLocated(firstname)).sendKeys(fname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastname)).sendKeys(lname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(address)).sendKeys(saddress);
        wait.until(ExpectedConditions.visibilityOfElementLocated(city)).sendKeys(scity);
        wait.until(ExpectedConditions.visibilityOfElementLocated(state)).sendKeys(sstate);
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipecode)).sendKeys(szipecode);
        wait.until(ExpectedConditions.visibilityOfElementLocated(phone)).sendKeys(sphone);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SSN)).sendKeys(sSSN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernamesignup)).sendKeys(susername);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordsignup)).sendKeys(spassword);
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmpassword)).sendKeys(sconfirmedpassword);

    }

    public void clickregisterbutton(){
        wait.until(ExpectedConditions.elementToBeClickable(registerbutton)).click();
    }
    public String getSuccessMessageText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sucessMessage)).getText();

    }
}
