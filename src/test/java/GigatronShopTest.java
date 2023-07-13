import org.openqa.selenium.chrome.ChromeDriver;
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

        popUpPage.clickOnPopup();
        popUpPage.clickPrihavti();
        homePage.inputSearch("Samsung");
    }

    @AfterMethod
    public void after()
    {
        driver.quit();
    }


}
