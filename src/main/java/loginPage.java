import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class loginPage {
    protected WebDriver driver;

    private By byTxtLoginUsername = By.name("username");
    private By byTxtLoginPassword = By.name("password");
    private By byLoginBtn = By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button");

    public void enterAccount(String accountName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement txtLoginAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(byTxtLoginUsername));
        txtLoginAccount.sendKeys(accountName);
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement txtLoginPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(byTxtLoginPassword));
        txtLoginPassword.sendKeys(password);
    }

    public void clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement btnLogin = wait.until(ExpectedConditions.elementToBeClickable(byLoginBtn));
        btnLogin.click();
    }
}
