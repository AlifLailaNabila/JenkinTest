package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

//import org.openqa.selenium.interactions.Actions;

public class HomePage extends CommonAPI {
    @FindBy(css = "#search-field")
    public static WebElement SearchInput;

    @FindBy(css = "#search-dropdown-select")
    public static WebElement AllInput;

    @FindBy(css = "#navigation-dropdown")
    public static WebElement AlldepartmentsInput;

    @FindBy(css = "#Home_Ancillary_3")
    public static WebElement HoverPharmacyElement;

    @FindBy(css = "#WC_CategoriesSidebarDisplayf_links_3_1")
    public static WebElement Electronics;

    @FindBy(css = "#WC_CategoriesSidebarDisplayf_links_3_1")
    public static WebElement TvNdTuner;

    @FindBy(xpath = "#WC_CategoriesSidebarDisplayf_links_3_1 > i")
    public static WebElement Electronicsxpath;


    @FindBy(xpath = "//*[@id=\"Home_Ancillary_0\"]")
    public static WebElement Grocery;

    @FindBy(xpath = "//*[@id=\"primary-category-container\"]/li[1]")
    public static WebElement Organic;
    @FindBy(id = "WC_CategoriesSidebarDisplayf_links_3_5")
    public static WebElement Furniture;



//#Home_Ancillary_3



    public WebElement getSearchInput(){
        return SearchInput;
    }
    public void getSearchResult(String value){
        getSearchInput().sendKeys(value,Keys.ENTER);
    }
    //click All

    public WebElement getAllInput(){
        return AllInput;
    }
    public void getclick(){
        getAllInput().click();
    }
    //click Shop All Departments
    public WebElement getAlldepartments(){
        return AlldepartmentsInput;
    }
    public void getclickAlldepartments(){
        getAlldepartments().click();
    }


//List showing all

    public List<String> testDropdown(){
        List<String> tx= new ArrayList<>();
        tx=getTextFromWebElements("#search-dropdown-select");
        return tx;
    }
    //hovering

    public void hoverShopAllDepartments(){
        /*WebElement element1 = AlldepartmentsInput;
        WebElement element2 = Electronics;
        WebElement element3 = TvNdTuner;*/
        Actions actions = new Actions(driver);
        actions.moveToElement(AlldepartmentsInput).perform();
        actions.moveToElement(Furniture).perform();
        //actions.moveToElement(TvNdTuner).click().perform();
    }
   }





