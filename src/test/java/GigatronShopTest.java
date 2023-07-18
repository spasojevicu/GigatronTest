import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTest{

    PopUpPage popUpPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        popUpPage = new PopUpPage((ChromeDriver) driver);
        homePage = new HomePage((ChromeDriver) driver);
    }

    @Test
    public void ShopTest(){

        homePage.inputSearch("Samsung");

        Assert.assertEquals(homePage.getResult.isDisplayed(),true,"SAMSUNG Galaxy S23 8/128GB Cream is displayed");
    }

    @AfterMethod
    public void after()
    {
        driver.quit();
    }


}
