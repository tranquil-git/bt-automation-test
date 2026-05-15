import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class hrmAdminPage {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/");

        //khai bao FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(chromeDriver);
        wait.withTimeout(Duration.ofSeconds(30)); //set time out chờ
        wait.pollingEvery(Duration.ofSeconds(1)); //sau bao lâu kiểm tra lại
        wait.ignoring(NoSuchMethodException.class);


        chromeDriver.quit();
    }
}