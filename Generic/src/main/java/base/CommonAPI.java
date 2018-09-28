package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class CommonAPI {
    public WebDriver driver;
   // @Parameters({url})
    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/alifnabila/IdeaProjects/JenkinsTesting/Generic/browser-driver/chromedriver");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.costco.com");
        Thread.sleep(7000);

    }
    @AfterMethod
    public void cleanUp(){
      //  driver.quit();
    }

    public List<String> getTextFromWebElements(String locator){
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for(WebElement web:element){
            text.add(web.getText());
        }
        return text;
    }

    public String getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }

    public void navigate(){
        driver.navigate().to("https://www.costco.com");
        driver.navigate().to("https://www.costco.com/LogonForm");
        driver.navigate().to("https://www.costcophotocenter.com/Home?utm_source=costco.com&utm_medium=referral&utm_campaign=Costco.com%20Navigation%20Bar&utm_term=Photo%20Main&utm_content=Photo");
    }

    public void navigateBack(){
        driver.navigate().back();
    }
    public void navigateForward(){
        driver.navigate().forward();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
   /* public void getTextByCss(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));
        String st=element.getText();
        System.out.println(st);
    }*/
    public String getTextByXpath(String locator){
        String st = driver.findElement(By.xpath(locator)).getText();
        System.out.println(st);
        return st;
    }


}
