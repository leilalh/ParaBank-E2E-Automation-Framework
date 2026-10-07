package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountOverviewPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By overviewTitle = By.cssSelector("h1.title");
    private By openNewAccount = By.linkText("Open New Account");


    public AccountOverviewPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;

    }

    public String getPageTitleText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(overviewTitle)).getText();
    }
    public void clickOpenNewAccount(){
        wait.until(ExpectedConditions.elementToBeClickable(openNewAccount)).click();
    }




}
