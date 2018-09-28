package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Grocery;

import java.util.concurrent.TimeUnit;

public class TestGrocery extends Grocery {
    Grocery grocery;
    @BeforeMethod
    public void initializationOfElement() {
        grocery = PageFactory.initElements(driver, Grocery.class);
    }
    @Test(priority = 1, enabled = true)
    public void testGroceryButton() {
        //grocery.clickGrocery();
    }
    @Test
    public void testGroceryClick(){
        grocery.clickGrocery();

    }

    @Test
     public void testGetText(){
        grocery.clickGrocery();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getTextByXpath("//*[@id=\"delivery-postal-popup-body\"]/span");
    }
    @Test
    public  void check(){
        grocery.clickGrocery();
        grocery.valueZipCodeCSS();
    }

}


