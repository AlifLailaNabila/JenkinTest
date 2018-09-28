package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Grocery extends CommonAPI {
    @FindBy(css = "#Home_Ancillary_0")
    public  static WebElement GroceryBarCSS;

    @FindBy(css = "#postal-code-input")
    public  static WebElement ZipCodeCSS;

    public void clickGrocery(){
        GroceryBarCSS.click();
    }
    public void valueZipCodeCSS(){
        GroceryBarCSS.click();
        ZipCodeCSS.sendKeys("10000", Keys.ENTER);
    }
}
