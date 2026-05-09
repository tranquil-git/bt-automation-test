import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class startBrowser {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // tat automation bar
        options.setExperimentalOption("useAutomationExtension", false);             // tat automation bar

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize(); // maximize windows
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/"); // home page

        //WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));

        //khai bao WebDriverWait
        //WebDriver wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));

        //khai bao FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(chromeDriver);
        wait.withTimeout(Duration.ofSeconds(30)); //set time out chờ
        wait.pollingEvery(Duration.ofSeconds(1)); //sau bao lâu kiểm tra lại
        wait.ignoring(NoSuchMethodException.class);

        chromeDriver.quit();
    }
}
