package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInOrRegister extends CommonAPI {

    @FindBy(css = "#header_sign_in")
    public static WebElement SignIn;
    @FindBy(css = "#logonId")
    public static WebElement EmailId;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(5) > input")
    public static WebElement SignInButton;
    //#logon > div > div > div > div
    @FindBy(css = "#LogonForm > fieldset")
    public static WebElement RegistrationFrame;

    //public void switchFrame(WebElement locator){
       // driver.switchTo().
    //}

    public void openingSignInPage(){
        //SignIn.click();
        //EmailId.click();
        //EmailId.sendKeys("abcd");
        //SignInButton.click();

    }
}
