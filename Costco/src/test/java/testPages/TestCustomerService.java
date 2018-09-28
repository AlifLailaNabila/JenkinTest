package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CustomerService;

public class TestCustomerService extends CustomerService {
    CustomerService customerService;

    @BeforeMethod
    public void initializationOfElement(){
        customerService=PageFactory.initElements(driver, CustomerService.class);
    }

    @Test(priority = 1, enabled = true)
    public void testCustomerService(){
        customerService.searchCustomerService();
    }
}
