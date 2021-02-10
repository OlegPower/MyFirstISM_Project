package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemOfParametersExpandListPage extends BasePage{
    @FindBy(css="#CLUSTER_SYSTEM")
    protected WebElement systemList;

    public SystemOfParametersExpandListPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
