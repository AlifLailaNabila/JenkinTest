package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInOrRegister;

public class TestSignIn extends SignInOrRegister {
    SignInOrRegister signInOrRegister;
    @BeforeMethod
    public void initializationOfElement() {
        signInOrRegister = PageFactory.initElements(driver, SignInOrRegister.class);
    }
    @Test
    public void openSignInBar(){
        SignIn.click();
        navigateBack();
        //EmailId.click();
        //EmailId.sendKeys("abcd");
        //WebElement element=RegistrationFrame;
        //signInOrRegister.switchFrame(element);
        //signInOrRegister.switchFrame("#logon > div > div > div > div");
        //signInOrRegister.openingSignInPage();
        //SignInButton.click();
    }
}
