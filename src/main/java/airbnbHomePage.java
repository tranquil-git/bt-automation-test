import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class airbnbHomePage {




    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver chromeDriver = new ChromeDriver(options);

        //Element
        //1
        WebElement adminTab = chromeDriver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
        //2
        WebElement pimTab = chromeDriver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
        //3
        WebElement leaveTab = chromeDriver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']"));
        //4
        WebElement txtLoginAccount = chromeDriver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
        //5
        WebElement dropdownListUserRole = chromeDriver.findElement(By.xpath("*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
        //6

        //7

        //8
        WebElement txtEmployeeName = chromeDriver.findElement(By.xpath("*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
        //9
        WebElement btnReset = chromeDriver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
        //10
        WebElement btnSearch = chromeDriver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        //11
        WebElement tabUserMng = chromeDriver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and text()='User Management ']"));
        //12
        WebElement row2Col1= chromeDriver.findElement(By.xpath("//div[@class='oxd-table-card'][2]/div[@role='row']/div[2]"));
        //13
        WebElement row2Col2 = chromeDriver.findElement(By.xpath("//div[@class='oxd-table-card'][2]/div[@role='row']/div[3]"));
        //14
        WebElement row2RemoveButton = chromeDriver.findElement(By.xpath("//div[@class='oxd-table-card'][2]/div[@role='row']/div[6]/div[@class='oxd-table-cell-actions']/button/i[@class='oxd-icon bi-trash']"));
        //15
        WebElement row2EditButton = chromeDriver.findElement(By.xpath("//div[@class='oxd-table-card'][2]/div[@role='row']/div[6]/div[@class='oxd-table-cell-actions']/button/i[@class='oxd-icon bi-pencil-fill']"));
        




    }
}
