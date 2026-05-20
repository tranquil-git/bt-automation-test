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
        WebElement airbnbLogo = chromeDriver.findElement(By.xpath("//a[@aria-current='page']/span*"));
        //2
        WebElement homeTab = chromeDriver.findElement(By.xpath("//li/a[text()='Home']"));
        //3
        WebElement homeAbout = chromeDriver.findElement(By.xpath("//li/a[text()='About']"));
        //4
        WebElement profileBtn = chromeDriver.findElement(By.xpath("//button/img[@class='h-10']"));
        //5
        WebElement locationSelection = chromeDriver.findElement(By.xpath("//div[@class='col-span-3  flex-1 px-6 py-3 flex flex-col justify-center items-center cursor-pointer ']/p[@class='text-sm']"));
        //6
        WebElement datePicker = chromeDriver.findElement(By.xpath("//div[@class='col-span-4 flex-1 smm:h-16 p-3 flex flex-col justify-center items-center cursor-pointer relative']/p"));
        //7
        WebElement numberOfCustomersSelection = chromeDriver.findElement(By.xpath("//div[@class='col-span-3 flex-1 p-3 flex justify-center items-center cursor-pointer relative gap-3']/p"));
        //8
        WebElement addBtn = chromeDriver.findElement(By.xpath("//div[@class='flex justify-between items-center gap-3']/button/div[text()='+']"));
        //9
        WebElement removeBtn = chromeDriver.findElement(By.xpath("//div[@class='flex justify-between items-center gap-3']/button/div[text()='-']"));
        //10
        WebElement hcmSelection = chromeDriver.findElement(By.xpath("//div[@class='grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6']/a[1]"));
        //11
        WebElement canThoLbl = chromeDriver.findElement(By.xpath("//div[@class='grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6']/a[2]/div/div/div[@class='flex items-center gap-3']/div/h2[text()='Cần Thơ']"));
        //12
        WebElement typeOfResidenceBtn = chromeDriver.findElement(By.xpath("//div[@class='container py-10 relative ']/div/button[1]"));
        //13
        WebElement typeOfPrice = chromeDriver.findElement(By.xpath("//div[@class='container py-10 relative ']/div/button[2]"));
        //14
        WebElement travelTime3Lbl = chromeDriver.findElement(By.xpath("//div[@class='grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6']/a[3]/div/div/div[@class='flex items-center gap-3']/div/p\n"));








    }
}
