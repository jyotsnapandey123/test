package Practice1;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;


        import java.util.concurrent.TimeUnit;

/**
 * Created by Ripon on 11/4/2015.
 */
public class AppTest {
    private WebDriver driver;
    //private SeleniumHQ seleniumHQ;
    //private Documentation documentationPage;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testVerifyTitle_WebDriverDocumentation() throws Exception {
        /*seleniumHQ = new SeleniumHQ(driver);
        Documentation documentationPage = seleniumHQ.clickDocumentation();
        WebDriverDocumentation webDriverDocumentation = documentationPage.navigateToWebDriverDocumentation();*/

        baseUrl = "https://www.w3schools.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl + "/");

        String actualTitle = driver.getTitle();
       // String expectedTitle = "Selenium WebDriver — Selenium Documentation";
        String expectedTitle = "W3Schools Online Web Tutorials";
        assertEquals(expectedTitle, actualTitle);
    }
}
