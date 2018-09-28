package testPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestHomePage extends HomePage {

    HomePage homePage;
    @BeforeMethod
    public void initializationOfElement() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void search(){
        //driver.findElement(By.cssSelector("#search-field")).sendKeys("Table", Keys.ENTER);
        HomePage hp1 = PageFactory.initElements(driver, HomePage.class);
        hp1.getSearchResult("Table");
    }
    @Test
    public  void click(){
        HomePage hp2 = PageFactory.initElements(driver, HomePage.class);
        hp2.getclick();
    }

    @Test
    public  void click2() {
        HomePage hp3 = PageFactory.initElements(driver, HomePage.class);
        hp3.getAlldepartments();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Test
    public void clickDropdown() {
        List<String> text1 = new ArrayList<String>();
        text1 = testDropdown();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (String e : text1) {
            System.out.println(e);
        }
    }
  @Test
  public void hoverPharmacy() {
      WebElement element = HoverPharmacyElement;
      Actions actions = new Actions(driver);
      actions.moveToElement(element).perform();
  }

  @Test
   public void testHoverShopAllDepartments(){
        hoverShopAllDepartments();
  }

  @Test
    public void testNavigate(){
        navigate();
        navigateBack();
        navigateBack();
        //navigateForward();
        //navigateBack();
        refreshPage();
  }
  @Test
    public void testCurrentURL(){
        navigate();
        getCurrentPageUrl();
  }

}
