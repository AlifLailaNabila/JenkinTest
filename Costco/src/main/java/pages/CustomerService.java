package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerService extends CommonAPI {
    @FindBy(css = "#customer-service-link")
    public static WebElement CustomerServiceCSS;
    @FindBy(css = "#rn_SourceSearchField_9_SearchInput")
    public static WebElement CustomerServiceSearchCSS;
    @FindBy(css = "#rn_SourceSearchButton_10_SubmitButton")
    public static WebElement CustomerServiceSubmitButtonCSS;


    public void searchCustomerService(){
        CustomerServiceCSS.click();
        CustomerServiceSearchCSS.sendKeys("Membership");
        CustomerServiceSubmitButtonCSS.click();
    }
}
