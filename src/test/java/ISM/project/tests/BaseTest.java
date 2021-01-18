package ISM.project.tests;
import ISM.project.pages.BasePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite(){
        BasePage.initDriver();
    }
    /*@AfterSuite
    public void afterSuite() {
        BasePage.closeDriver();
    }*/
}
