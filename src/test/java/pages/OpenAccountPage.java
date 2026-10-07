package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenAccountPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By typeDropDown = By.id("type");
    private By openAccountButton = By.cssSelector("input[value='Open New Account']");
    private By newAccountId = By.id("newAccountId");// Locateur du nouveau compte


    public OpenAccountPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;

    }


    public void selectAccountType(String type){
        wait.until(ExpectedConditions.visibilityOfElementLocated(typeDropDown));
        Select select = new Select(driver.findElement(typeDropDown));
        select.selectByVisibleText(type);

    }

    public void clickOpenAccountButton(){
        wait.until(ExpectedConditions.elementToBeClickable(openAccountButton)).click();
    }
    public boolean isNewAccountDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(newAccountId)).isDisplayed();
    }
}
